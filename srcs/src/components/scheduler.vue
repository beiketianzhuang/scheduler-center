<template>
    <div>
        <el-card class="box-card">
            <div slot="header" class="clearfix">
                <span>job管理</span>
                <el-button @click="getJobs()" style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
            </div>
            <el-table
                    :data="jobInfos"
                    style="width: 100%">
                <el-table-column
                        prop="jobName"
                        label="名称"
                        min-width="25%">
                </el-table-column>
                <el-table-column
                        prop="repeatCount"
                        label="失败重试次数"
                        min-width="25%">
                </el-table-column>
                <el-table-column
                        prop="timeout"
                        label="超时时间"
                        min-width="25%">
                </el-table-column>
                <el-table-column
                        prop="description"
                        label="描述"
                        min-width="25%">
                </el-table-column>
                <el-table-column
                        fixed="right"
                        label="操作"
                        min-width="25%">
                    <template slot-scope="scope">
                        <el-button @click="handleClick(scope.row)" type="text">
                            <i class="el-icon-edit"></i>
                        </el-button>
                        <el-button type="text">
                            <i class="el-icon-delete"></i>
                        </el-button>
                    </template>
                </el-table-column>
            </el-table>
        </el-card>
        <el-dialog title="job编辑" :visible.sync="editJob">
            <el-form :model="jobInfo">
                <el-form-item label="job名称:" label-width="120px">
                    <el-input v-model="jobInfo.jobName" disabled=""></el-input>
                </el-form-item>
                <el-form-item label="失败重试次数:" label-width="120px">
                    <el-input v-model="jobInfo.repeatCount"></el-input>
                </el-form-item>
                <el-form-item label="超时时间:" label-width="120px">
                    <el-input v-model="jobInfo.timeout"></el-input>
                </el-form-item>
                <el-form-item label="描述:" label-width="120px">
                    <el-input v-model="jobInfo.description"></el-input>
                </el-form-item>
            </el-form>
            <div slot="footer" class="dialog-footer">
                <el-button @click="editJob = false">取 消</el-button>
                <el-button type="primary" @click="editJob = false">确 定</el-button>
            </div>
        </el-dialog>
        <el-card class="box-card" style="margin-top: 20px">
            <div slot="header" class="clearfix">
                <span>Trigger管理</span>
                <!--<el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>-->
            </div>
            <!--<el-table-->
            <!--:data="tableData"-->
            <!--style="width: 100%">-->
            <!--<el-table-column-->
            <!--prop="date"-->
            <!--label="名称"-->
            <!--min-width="25">-->
            <!--</el-table-column>-->
            <!--<el-table-column-->
            <!--prop="name"-->
            <!--label="失败重试次数"-->
            <!--min-width="25">-->
            <!--</el-table-column>-->
            <!--<el-table-column-->
            <!--prop="address"-->
            <!--label="超时时间"-->
            <!--min-width="25">-->
            <!--</el-table-column>-->
            <!--<el-table-column-->
            <!--prop="address"-->
            <!--label="描述"-->
            <!--min-width="25">-->
            <!--</el-table-column>-->
            <!--</el-table>-->
        </el-card>
    </div>
</template>
<script>
    import {mapGetters} from 'vuex';

    export default {
        name: "scheduler",
        data() {
            return {
                jobInfo: {},
                editJob:false,
            }
        },
        methods: {
            getJobs() {
                this.$store.dispatch("getJobInfos");
            },
            handleClick(data) {
                this.jobInfo = data;
                this.editJob = true;
            }
        },
        created() {
            this.getJobs();
        },
        computed: {
            ...mapGetters([
                'jobInfos'
            ])
        }
    }
</script>

<style scoped>
    .text {
        font-size: 14px;
    }

    .item {
        margin-bottom: 18px;
    }

    .clearfix:before,
    .clearfix:after {
        display: table;
        content: "";
    }

    .clearfix:after {
        clear: both
    }

    .box-card {
        width: 100%;
    }
</style>