package zhaoxixiang.bwie.com.weiyingtest.Bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by admin on 2017/12/14/014.
 */

public class PingLunBean extends BaseBean{

    /**
     * ret : {"pnum":1,"totalRecords":13,"records":20,"list":[{"msg":"真好看","phoneNumber":"🇨🇳 🇨🇳 🇨🇳","dataId":"ff8080815ffc3a7f016019c5ca331c18","userPic":"http://wx.qlogo.cn/mmopen/vi_32/rjzibc40oDkA4p5HEmaFuCfpicM1DG6jMaxibEB0Zf0V8GWHPMUsbMNk8wywCCzbqib5oKrExndoICjlvcBs1xnSPA/0","time":"2017-12-03 08:28:00","likeNum":0},{"msg":"同意的顶起","phoneNumber":"魅力你君哥","dataId":"ff8080815fa38f91015fa3e521fc01f7","userPic":"http://wx.qlogo.cn/mmopen/wprMnqDUJH6OK32YrKfKnyRXRQPEwxzNUJ2LkPgJYZbszAp5BIicVAOQKpFFLYGXZGtib8ojpUx0osuhLYvrickLg/0","time":"2017-11-10 11:07:03","likeNum":0},{"msg":"APP就是好哟，","phoneNumber":"小河北","dataId":"ff8080815f4cff52015f4d1026a300a2","userPic":"http://q.qlogo.cn/qqapp/1101034181/99EE42F11A114ED4DD98151DCC8BB2E2/40","time":"2017-10-24 14:27:04","likeNum":1},{"msg":"哈哈","phoneNumber":"千殇丶 落影","dataId":"ff8080815f387f1e015f3dea85b1733d","userPic":"http://q.qlogo.cn/qqapp/1101034181/FE8419E8E66504386B4728B1BE47D250/40","time":"2017-10-21 15:51:40","likeNum":0},{"msg":"怎么才四十二分钟啊。","phoneNumber":"-兜里的猪-","dataId":"ff8080815d54cc06015d594c60b02591","userPic":"http://tvax4.sinaimg.cn/crop.0.0.664.664.1024/006SJdKVly8fhfujkv6z8j30ig0ig0tz.jpg","time":"2017-07-19 13:22:44","likeNum":2},{"msg":"哦依稀","phoneNumber":"💔🎍😌你你仔细","dataId":"ff8080815d078b01015d1ad553ca070f","userPic":"http://q.qlogo.cn/qqapp/1101034181/57A8E0BEA7F1BFFEE8F8AEF4D34F2C41/40","time":"2017-07-07 10:16:14","likeNum":0},{"msg":"还可以哦，APP好用","phoneNumber":"133****8981","dataId":"ff8080815ceda201015cfce4257e674c","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/07/01/1498886288543120235.jpg","time":"2017-07-01 14:43:49","likeNum":3},{"msg":"额","phoneNumber":"赵之雯","dataId":"ff8080815ceda201015cfb0ce7af1cfe","userPic":"http://q.qlogo.cn/qqapp/1101034181/45E7BFF296CB3D92A25A1013D4386C69/40","time":"2017-07-01 06:09:05","likeNum":0},{"msg":"厉害，","phoneNumber":"157****9299","dataId":"ff8080815c9b957b015ca6d63beb5859","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/06/14/1497417919927805045.jpg","time":"2017-06-14 21:41:16","likeNum":0},{"msg":"很喜欢这种类型的电影，简直是一种享受。","phoneNumber":"终于放弃你","dataId":"ff8080815c7b49e6015c7ce2427a0d12","userPic":"","time":"2017-06-01 17:10:21","likeNum":2},{"msg":"超喜欢男神的这部片子，就是喜欢。","phoneNumber":"诉说你的悲伤","dataId":"ff8080815c7b49e6015c7ce242580d11","userPic":"","time":"2017-05-31 13:10:21","likeNum":3},{"msg":"故事情节一般，没啥新意。","phoneNumber":"给你快乐","dataId":"ff8080815c7b49e6015c7ce242560d10","userPic":"","time":"2017-05-29 01:10:21","likeNum":6},{"msg":"手机电影APP的片子还挺多，不错不错！","phoneNumber":"陌路丢了谁","dataId":"ff8080815c7b49e6015c7ce242530d0f","userPic":"","time":"2017-05-14 06:55:21","likeNum":4}],"totalPnum":1}
     */

    private RetBean ret;

    public RetBean getRet() {
        return ret;
    }

    public void setRet(RetBean ret) {
        this.ret = ret;
    }

    public static class RetBean {
        /**
         * pnum : 1
         * totalRecords : 13
         * records : 20
         * list : [{"msg":"真好看","phoneNumber":"🇨🇳 🇨🇳 🇨🇳","dataId":"ff8080815ffc3a7f016019c5ca331c18","userPic":"http://wx.qlogo.cn/mmopen/vi_32/rjzibc40oDkA4p5HEmaFuCfpicM1DG6jMaxibEB0Zf0V8GWHPMUsbMNk8wywCCzbqib5oKrExndoICjlvcBs1xnSPA/0","time":"2017-12-03 08:28:00","likeNum":0},{"msg":"同意的顶起","phoneNumber":"魅力你君哥","dataId":"ff8080815fa38f91015fa3e521fc01f7","userPic":"http://wx.qlogo.cn/mmopen/wprMnqDUJH6OK32YrKfKnyRXRQPEwxzNUJ2LkPgJYZbszAp5BIicVAOQKpFFLYGXZGtib8ojpUx0osuhLYvrickLg/0","time":"2017-11-10 11:07:03","likeNum":0},{"msg":"APP就是好哟，","phoneNumber":"小河北","dataId":"ff8080815f4cff52015f4d1026a300a2","userPic":"http://q.qlogo.cn/qqapp/1101034181/99EE42F11A114ED4DD98151DCC8BB2E2/40","time":"2017-10-24 14:27:04","likeNum":1},{"msg":"哈哈","phoneNumber":"千殇丶 落影","dataId":"ff8080815f387f1e015f3dea85b1733d","userPic":"http://q.qlogo.cn/qqapp/1101034181/FE8419E8E66504386B4728B1BE47D250/40","time":"2017-10-21 15:51:40","likeNum":0},{"msg":"怎么才四十二分钟啊。","phoneNumber":"-兜里的猪-","dataId":"ff8080815d54cc06015d594c60b02591","userPic":"http://tvax4.sinaimg.cn/crop.0.0.664.664.1024/006SJdKVly8fhfujkv6z8j30ig0ig0tz.jpg","time":"2017-07-19 13:22:44","likeNum":2},{"msg":"哦依稀","phoneNumber":"💔🎍😌你你仔细","dataId":"ff8080815d078b01015d1ad553ca070f","userPic":"http://q.qlogo.cn/qqapp/1101034181/57A8E0BEA7F1BFFEE8F8AEF4D34F2C41/40","time":"2017-07-07 10:16:14","likeNum":0},{"msg":"还可以哦，APP好用","phoneNumber":"133****8981","dataId":"ff8080815ceda201015cfce4257e674c","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/07/01/1498886288543120235.jpg","time":"2017-07-01 14:43:49","likeNum":3},{"msg":"额","phoneNumber":"赵之雯","dataId":"ff8080815ceda201015cfb0ce7af1cfe","userPic":"http://q.qlogo.cn/qqapp/1101034181/45E7BFF296CB3D92A25A1013D4386C69/40","time":"2017-07-01 06:09:05","likeNum":0},{"msg":"厉害，","phoneNumber":"157****9299","dataId":"ff8080815c9b957b015ca6d63beb5859","userPic":"http://phonemovie.ks3-cn-beijing.ksyun.com/%2Fupload/memberPic/2017/06/14/1497417919927805045.jpg","time":"2017-06-14 21:41:16","likeNum":0},{"msg":"很喜欢这种类型的电影，简直是一种享受。","phoneNumber":"终于放弃你","dataId":"ff8080815c7b49e6015c7ce2427a0d12","userPic":"","time":"2017-06-01 17:10:21","likeNum":2},{"msg":"超喜欢男神的这部片子，就是喜欢。","phoneNumber":"诉说你的悲伤","dataId":"ff8080815c7b49e6015c7ce242580d11","userPic":"","time":"2017-05-31 13:10:21","likeNum":3},{"msg":"故事情节一般，没啥新意。","phoneNumber":"给你快乐","dataId":"ff8080815c7b49e6015c7ce242560d10","userPic":"","time":"2017-05-29 01:10:21","likeNum":6},{"msg":"手机电影APP的片子还挺多，不错不错！","phoneNumber":"陌路丢了谁","dataId":"ff8080815c7b49e6015c7ce242530d0f","userPic":"","time":"2017-05-14 06:55:21","likeNum":4}]
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
             * msg : 真好看
             * phoneNumber : 🇨🇳 🇨🇳 🇨🇳
             * dataId : ff8080815ffc3a7f016019c5ca331c18
             * userPic : http://wx.qlogo.cn/mmopen/vi_32/rjzibc40oDkA4p5HEmaFuCfpicM1DG6jMaxibEB0Zf0V8GWHPMUsbMNk8wywCCzbqib5oKrExndoICjlvcBs1xnSPA/0
             * time : 2017-12-03 08:28:00
             * likeNum : 0
             */

            @SerializedName("msg")
            private String msgX;
            private String phoneNumber;
            private String dataId;
            private String userPic;
            private String time;
            private int likeNum;

            public String getMsgX() {
                return msgX;
            }

            public void setMsgX(String msgX) {
                this.msgX = msgX;
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
