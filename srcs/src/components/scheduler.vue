<template>
    <div>
    <el-card class="box-card">
        <div slot="header" class="clearfix">
            <span>job管理</span>
            <el-button @click="getJobs()" style="float: right; padding: 3px 0" type="text">操作按钮</el-button>
        </div>
        <el-table
                :data="tableData"
                style="width: 100%">
            <el-table-column
                    prop="date"
                    label="名称"
                    min-width="25%">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="失败重试次数"
                    min-width="25%">
            </el-table-column>
            <el-table-column
                    prop="address"
                    label="超时时间"
                    min-width="25%">
            </el-table-column>
            <el-table-column
                    prop="address"
                    label="描述"
                    min-width="25%">
            </el-table-column>
        </el-table>
    </el-card>
    <el-card class="box-card" style="margin-top: 20px">
        <div slot="header" class="clearfix">
            <span>Trigger管理</span>
            <!--<el-button style="float: right; padding: 3px 0" type="text">操作按钮</el-button>-->
        </div>
        <el-table
                :data="tableData"
                style="width: 100%">
            <el-table-column
                    prop="date"
                    label="名称"
                    min-width="25">
            </el-table-column>
            <el-table-column
                    prop="name"
                    label="失败重试次数"
                    min-width="25">
            </el-table-column>
            <el-table-column
                    prop="address"
                    label="超时时间"
                    min-width="25">
            </el-table-column>
            <el-table-column
                    prop="address"
                    label="描述"
                    min-width="25">
            </el-table-column>
        </el-table>
    </el-card>
    </div>
</template>

<script>
    export default {
        name: "scheduler",
        data() {
            return {
                tableData: [{
                    date: '2016-05-02',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1518 弄'
                }, {
                    date: '2016-05-04',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1517 弄'
                }, {
                    date: '2016-05-01',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1519 弄'
                }, {
                    date: '2016-05-03',
                    name: '王小虎',
                    address: '上海市普陀区金沙江路 1516 弄'
                }]
            }
        },
        methods:{
            getJobs() {
                this.$store.dispatch("getJobs");
            }
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