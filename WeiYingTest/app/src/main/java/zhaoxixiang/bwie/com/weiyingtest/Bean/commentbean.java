package zhaoxixiang.bwie.com.weiyingtest.Bean;

import java.util.List;

/**
 * Created by 胡靖宇 on 2017/12/17.
 */

public class commentbean {

    /**
     * msg : 成功
     * ret : {"pnum":1,"totalRecords":9,"records":20,"list":[{"msg":"没声音呀","phoneNumber":"八千海里顾你一世","dataId":"ff8080815ffc398501602679c7ef561f","userPic":"http://q.qlogo.cn/qqapp/1101034181/9E8682D80395871CB1EC56CE7FD4F6E0/40","time":"2017-12-05 19:40:03","likeNum":0},{"msg":"没有声音，还以为手机坏了。","phoneNumber":"钟表人生","dataId":"ff8080815ffc3a7f01602190bd9923cb","userPic":"http://q.qlogo.cn/qqapp/1101034181/6EB4F56381E193FF3980C50C9D21E5D5/40","time":"2017-12-04 20:47:02","likeNum":1},{"msg":"木有声音","phoneNumber":"须臾幻境","dataId":"ff8080815f6b5cd5015f9f1570083736","userPic":"http://wx.qlogo.cn/mmopen/vi_32/0AicOpptPmtaNFck5pJ3VwFYNaXiaQicd1Edfib2R6tJY7PIApyUvBcKn6x7pwLERVNKGeqAtib8pumLSd9WThNVeibQ/0","time":"2017-11-09 12:41:43","likeNum":1},{"msg":"没声音","phoneNumber":"136****8579","dataId":"ff8080815f6b5cd5015f8fda10d7444d","userPic":"","time":"2017-11-06 13:42:33","likeNum":1},{"msg":"为什么没有声音？","phoneNumber":"℡愛是一種承諾℡","dataId":"ff8080815ceda201015d03aee5ac4615","userPic":"http://qzapp.qlogo.cn/qzapp/1101034181/86BC3178C18F3779025564737A206B53/100","time":"2017-07-02 22:23:00","likeNum":6},{"msg":"这片子早就应该看了，幸好没有错过这么好的片子。","phoneNumber":"你不懂我","dataId":"ff8080815cb03cdc015ccec148b16ac5","userPic":"","time":"2017-06-06 14:43:12","likeNum":2},{"msg":"还行吧，值得一看。","phoneNumber":"盗不走的爱人","dataId":"ff8080815cb03cdc015ccec148ac6ac3","userPic":"","time":"2017-06-02 03:43:12","likeNum":4},{"msg":"我给这个片子7分，还有上升空间。","phoneNumber":"伪装坚强","dataId":"ff8080815cb03cdc015ccec148ae6ac4","userPic":"","time":"2017-05-31 05:54:12","likeNum":1},{"msg":"本来没想看这个，看完了觉得还行，没有想象中的那么差劲。","phoneNumber":"终于放弃你","dataId":"ff8080815cb03cdc015ccec148aa6ac2","userPic":"","time":"2017-05-15 17:23:12","likeNum":1}],"totalPnum":1}
     * code : 200
     */

    private String msg;
    private RetBean ret;
    private String code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static class RetBean {
        /**
         * pnum : 1
         * totalRecords : 9
         * records : 20
         * list : [{"msg":"没声音呀","phoneNumber":"八千海里顾你一世","dataId":"ff8080815ffc398501602679c7ef561f","userPic":"http://q.qlogo.cn/qqapp/1101034181/9E8682D80395871CB1EC56CE7FD4F6E0/40","time":"2017-12-05 19:40:03","likeNum":0},{"msg":"没有声音，还以为手机坏了。","phoneNumber":"钟表人生","dataId":"ff8080815ffc3a7f01602190bd9923cb","userPic":"http://q.qlogo.cn/qqapp/1101034181/6EB4F56381E193FF3980C50C9D21E5D5/40","time":"2017-12-04 20:47:02","likeNum":1},{"msg":"木有声音","phoneNumber":"须臾幻境","dataId":"ff8080815f6b5cd5015f9f1570083736","userPic":"http://wx.qlogo.cn/mmopen/vi_32/0AicOpptPmtaNFck5pJ3VwFYNaXiaQicd1Edfib2R6tJY7PIApyUvBcKn6x7pwLERVNKGeqAtib8pumLSd9WThNVeibQ/0","time":"2017-11-09 12:41:43","likeNum":1},{"msg":"没声音","phoneNumber":"136****8579","dataId":"ff8080815f6b5cd5015f8fda10d7444d","userPic":"","time":"2017-11-06 13:42:33","likeNum":1},{"msg":"为什么没有声音？","phoneNumber":"℡愛是一種承諾℡","dataId":"ff8080815ceda201015d03aee5ac4615","userPic":"http://qzapp.qlogo.cn/qzapp/1101034181/86BC3178C18F3779025564737A206B53/100","time":"2017-07-02 22:23:00","likeNum":6},{"msg":"这片子早就应该看了，幸好没有错过这么好的片子。","phoneNumber":"你不懂我","dataId":"ff8080815cb03cdc015ccec148b16ac5","userPic":"","time":"2017-06-06 14:43:12","likeNum":2},{"msg":"还行吧，值得一看。","phoneNumber":"盗不走的爱人","dataId":"ff8080815cb03cdc015ccec148ac6ac3","userPic":"","time":"2017-06-02 03:43:12","likeNum":4},{"msg":"我给这个片子7分，还有上升空间。","phoneNumber":"伪装坚强","dataId":"ff8080815cb03cdc015ccec148ae6ac4","userPic":"","time":"2017-05-31 05:54:12","likeNum":1},{"msg":"本来没想看这个，看完了觉得还行，没有想象中的那么差劲。","phoneNumber":"终于放弃你","dataId":"ff8080815cb03cdc015ccec148aa6ac2","userPic":"","time":"2017-05-15 17:23:12","likeNum":1}]
         * totalPnum : 1
         */

        private int pnum;
        private int totalRecords;
        private int records;
        private int totalPnum;
        private List<ListBean> list;

        public int getPnum() {
            return pnum;
        }

        public void setPnum(int pnum) {
            this.pnum = pnum;
        }

        public int getTotalRecords() {
            return totalRecords;
        }

        public void setTotalRecords(int totalRecords) {
            this.totalRecords = totalRecords;
        }

        public int getRecords() {
            return records;
        }

        public void setRecords(int records) {
            this.records = records;
        }

        public int getTotalPnum() {
            return totalPnum;
        }

        public void setTotalPnum(int totalPnum) {
            this.totalPnum = totalPnum;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * msg : 没声音呀
             * phoneNumber : 八千海里顾你一世
             * dataId : ff8080815ffc398501602679c7ef561f
             * userPic : http://q.qlogo.cn/qqapp/1101034181/9E8682D80395871CB1EC56CE7FD4F6E0/40
             * time : 2017-12-05 19:40:03
             * likeNum : 0
             */

            private String msg;
            private String phoneNumber;
            private String dataId;
            private String userPic;
            private String time;
            private int likeNum;

            public String getMsg() {
                return msg;
            }

            public void setMsg(String msg) {
                this.msg = msg;
            }

            public String getPhoneNumber() {
                return phoneNumber;
            }

            public void setPhoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
            }

            public String getDataId() {
                return dataId;
            }

            public void setDataId(String dataId) {
                this.dataId = dataId;
            }

            public String getUserPic() {
                return userPic;
            }

            public void setUserPic(String userPic) {
                this.userPic = userPic;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getLikeNum() {
                return likeNum;
            }

            public void setLikeNum(int likeNum) {
                this.likeNum = likeNum;
            }
        }
    }
}
