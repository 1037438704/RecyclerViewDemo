package com.example.ninetaildemonfox.recyclerviewdemo;

import java.util.List;

/**
 * Created by NineTailDemonFox on 2019/4/10.
 */

public class Bean {

    /**
     * code : 200
     * remark : 请求成功
     * result : {"video":[[{"videoId":21,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:27:07","updateTime":"2019-04-03 18:27:07","columnWeight":4},{"videoId":20,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:25:29","updateTime":"2019-04-03 18:25:29","columnWeight":4},{"videoId":7,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"asdfdsafdsf","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-02 11:26:52","updateTime":"2019-04-02 11:26:52","columnWeight":4},{"videoId":3,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"新增视频","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-22/3f40c0c0-044a-4ed6-878d-5185e0df487d.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-22 16:33:29","updateTime":null,"columnWeight":4}],[{"videoId":22,"columnId":2,"columnName":"1111113333","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:29:50","updateTime":"2019-04-03 18:29:50","columnWeight":1},{"videoId":5,"columnId":2,"columnName":"1111113333","title":"2131231","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-01/92f95149-77e4-4903-94bd-a2b8b8bf899d.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-01 13:52:21","updateTime":"2019-04-01 13:52:21","columnWeight":1},{"videoId":4,"columnId":2,"columnName":"1111113333","title":"啊手动阀手动阀","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-22/3d3cfb5c-eaab-4491-af97-a65ece46ce27.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-22 16:34:17","updateTime":null,"columnWeight":1},{"videoId":2,"columnId":2,"columnName":"1111113333","title":"芝麻胡同","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/bf4a3137-c4e1-4c97-8025-a88768dd90f0.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-21 19:43:51","updateTime":"2019-03-22 11:55:51","columnWeight":1}],[{"videoId":24,"columnId":14,"columnName":"我是栏目","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:38:50","updateTime":"2019-04-03 18:38:50","columnWeight":5},{"videoId":23,"columnId":14,"columnName":"我是栏目","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:35:35","updateTime":"2019-04-03 18:35:35","columnWeight":5},{"videoId":6,"columnId":14,"columnName":"我是栏目","title":"dsafsadfsdfsdf","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/dd16ade6-1b7e-4616-bb1f-caadcd87d69d.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-02 11:22:28","updateTime":"2019-04-02 11:22:28","columnWeight":5},{"videoId":1,"columnId":14,"columnName":"我是栏目","title":"测试视频","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/1ab134cf-2883-40c7-922e-880685489713.jpg","weight":90,"showStatus":1,"delStatus":0,"createTime":"2019-03-21 19:35:10","updateTime":"2019-03-21 19:35:25","columnWeight":5}]],"info":"success"}
     * pageInfo : null
     */

    private int code;
    private String remark;
    private ResultBean result;
    private Object pageInfo;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public Object getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(Object pageInfo) {
        this.pageInfo = pageInfo;
    }

    public static class ResultBean {
        /**
         * video : [[{"videoId":21,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:27:07","updateTime":"2019-04-03 18:27:07","columnWeight":4},{"videoId":20,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:25:29","updateTime":"2019-04-03 18:25:29","columnWeight":4},{"videoId":7,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"asdfdsafdsf","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-02 11:26:52","updateTime":"2019-04-02 11:26:52","columnWeight":4},{"videoId":3,"columnId":13,"columnName":"万鑫 车市流浪猫","title":"新增视频","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-22/3f40c0c0-044a-4ed6-878d-5185e0df487d.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-22 16:33:29","updateTime":null,"columnWeight":4}],[{"videoId":22,"columnId":2,"columnName":"1111113333","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:29:50","updateTime":"2019-04-03 18:29:50","columnWeight":1},{"videoId":5,"columnId":2,"columnName":"1111113333","title":"2131231","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-01/92f95149-77e4-4903-94bd-a2b8b8bf899d.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-01 13:52:21","updateTime":"2019-04-01 13:52:21","columnWeight":1},{"videoId":4,"columnId":2,"columnName":"1111113333","title":"啊手动阀手动阀","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-22/3d3cfb5c-eaab-4491-af97-a65ece46ce27.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-22 16:34:17","updateTime":null,"columnWeight":1},{"videoId":2,"columnId":2,"columnName":"1111113333","title":"芝麻胡同","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/bf4a3137-c4e1-4c97-8025-a88768dd90f0.jpg","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-03-21 19:43:51","updateTime":"2019-03-22 11:55:51","columnWeight":1}],[{"videoId":24,"columnId":14,"columnName":"我是栏目","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:38:50","updateTime":"2019-04-03 18:38:50","columnWeight":5},{"videoId":23,"columnId":14,"columnName":"我是栏目","title":"string","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-03 18:35:35","updateTime":"2019-04-03 18:35:35","columnWeight":5},{"videoId":6,"columnId":14,"columnName":"我是栏目","title":"dsafsadfsdfsdf","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/dd16ade6-1b7e-4616-bb1f-caadcd87d69d.png","weight":0,"showStatus":1,"delStatus":0,"createTime":"2019-04-02 11:22:28","updateTime":"2019-04-02 11:22:28","columnWeight":5},{"videoId":1,"columnId":14,"columnName":"我是栏目","title":"测试视频","coverImgUrl":"http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-03-21/1ab134cf-2883-40c7-922e-880685489713.jpg","weight":90,"showStatus":1,"delStatus":0,"createTime":"2019-03-21 19:35:10","updateTime":"2019-03-21 19:35:25","columnWeight":5}]]
         * info : success
         */

        private String info;
        private List<List<VideoBean>> video;

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public List<List<VideoBean>> getVideo() {
            return video;
        }

        public void setVideo(List<List<VideoBean>> video) {
            this.video = video;
        }

        public static class VideoBean {
            /**
             * videoId : 21
             * columnId : 13
             * columnName : 万鑫 车市流浪猫
             * title : string
             * coverImgUrl : http://shdy-oss.oss-cn-huhehaote.aliyuncs.com/shdy-cfc-img/2019-04-02/c5b331d9-7441-44d3-ba1a-2f9889dbdbcb.png
             * weight : 0
             * showStatus : 1
             * delStatus : 0
             * createTime : 2019-04-03 18:27:07
             * updateTime : 2019-04-03 18:27:07
             * columnWeight : 4
             */

            private int videoId;
            private int columnId;
            private String columnName;
            private String title;
            private String coverImgUrl;
            private int weight;
            private int showStatus;
            private int delStatus;
            private String createTime;
            private String updateTime;
            private int columnWeight;

            public int getVideoId() {
                return videoId;
            }

            public void setVideoId(int videoId) {
                this.videoId = videoId;
            }

            public int getColumnId() {
                return columnId;
            }

            public void setColumnId(int columnId) {
                this.columnId = columnId;
            }

            public String getColumnName() {
                return columnName;
            }

            public void setColumnName(String columnName) {
                this.columnName = columnName;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getCoverImgUrl() {
                return coverImgUrl;
            }

            public void setCoverImgUrl(String coverImgUrl) {
                this.coverImgUrl = coverImgUrl;
            }

            public int getWeight() {
                return weight;
            }

            public void setWeight(int weight) {
                this.weight = weight;
            }

            public int getShowStatus() {
                return showStatus;
            }

            public void setShowStatus(int showStatus) {
                this.showStatus = showStatus;
            }

            public int getDelStatus() {
                return delStatus;
            }

            public void setDelStatus(int delStatus) {
                this.delStatus = delStatus;
            }

            public String getCreateTime() {
                return createTime;
            }

            public void setCreateTime(String createTime) {
                this.createTime = createTime;
            }

            public String getUpdateTime() {
                return updateTime;
            }

            public void setUpdateTime(String updateTime) {
                this.updateTime = updateTime;
            }

            public int getColumnWeight() {
                return columnWeight;
            }

            public void setColumnWeight(int columnWeight) {
                this.columnWeight = columnWeight;
            }
        }
    }
}
