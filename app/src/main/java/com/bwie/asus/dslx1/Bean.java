package com.bwie.asus.dslx1;

import java.util.List;

public class Bean {


    /**
     * code : 200
     * msg : success
     * newslist : [{"ctime":"2018-11-27","title":"|必读|汝之蜜糖彼之砒霜:FDA警告1岁内婴儿不宜喂食蜂蜜","description":"全球医生组织","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/E88Sm1WX6Y6yh2cbRiaQeOJEjCPNWGqxibdD7cibVaIiaEEeI7JtwZGIwuhAqvvzvUaKxKqN0ZRPnWhibIkmbvm6HVw/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280403&ver=1269&signature=XMCKhVJmNyDwdpH-fs9XbxtP9QfraUp5EcXHGu8Orr5L5H0wIjmiCiS3I16pNanOvlfhA*Tv3tLBlhR*MP0zpeHYyBHrb4Y7r6IFQtkiI51jufWhTr6YAVbxnmfKxrbW&new=1"},{"ctime":"2018-11-27","title":"孩子打死不学习，就得用1句\u201c狠话\u201d解决，无数家长点赞！","description":"圣贤传统文化","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/fwtibtCiaVCt6KIMRLC3ATXSOAhd1vG7q2U2gLDTeLicpjN6BCHAGxGaSY7CdCV26bdnTKm1ibkJWDksicrke0IGAicw/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280418&ver=1269&signature=C5nAVpgcGb1pn9VJeDO2jTJtEWOU6OHmyFxNxFwcYVlwxto57-OMgo5S8vOj*rYkUggb-IdbhzKxcdD2i6IEYwihojKkCvWuB6M*8zV4kA5PSVz65PA8v48mlyYst*EO&new=1"},{"ctime":"2018-11-27","title":"每年70万例心梗，仅5%被及时规范救治！这两个\u201c120\u201d能救命\u2026","description":"医药汇通","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/vvoKIgTTAYpibQSeYYeemuicclEMt429LjXHrO1eHyaaOS5uyrl8paMeMTqQeSCYKXcqaz19HtU8GGbOze9FJjsA/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280403&ver=1269&signature=cuzcIY-0MlobvYkrGiiye2F2IIB9ito5fsUck3F7BQQOLAMjMQKp47PeI1jwVLXIt0G9hpEeM61tlMdnCQxzLFG3uBx99ES0EefXKC-erNk96IMj2-mYUWlMHlxyDdG9&new=1"},{"ctime":"2018-11-27","title":"敲黑板！一份权威信息采集表显示，科创板候选企业起码具备四大特征！","description":"上海证券报","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/xbUOr6jbzYKDx1cffOrY818O2pYJLz8UZKkG1WMI1fLicdPIFz5niaDMxiamIbJWHIDjIJ25CqCHbpwoARROlR4bw/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280408&ver=1269&signature=A9nobzPK9DzgAVP6WyBCPEr3UfdqH*A0lXMLbzUNMV94qJ1WmhDKT7L2wZyKPkp0wIZ3K97YUv3uXm6nMXKStdxg-YQTzn-Em2sIun65hN2qVSgRTHeZGP*bft3Ur*0L&new=1"},{"ctime":"2018-11-27","title":"受欢迎=车好？车主告诉你凯迪拉克XT4值不值得下手","description":"车漫部落","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/ue7O9yhgLB0CKR4eiaTEFib6Pv2ddgWqUUZJUibtC08VKI31eTkNtZ50lAmlmPzCyHejKiabeUyl2NN9aiciaiauibx4Vw/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280409&ver=1269&signature=j1ZrQNWvM37aVspN2SBHX03J2fqOGqOdduk5oeejDkR3d37H1fUYzKXVF1qqlQ3wu*WFhS8Nmz1DIR-9PI6qlVPXyb2Y09M3qpACz9Q0kdgDY7ndX4xv5S*dRm6BbRqi&new=1"},{"ctime":"2018-11-27","title":"一目了然，让心血管知识轻松好记！","description":"好医术心学院","picUrl":"http://mmbiz.qpic.cn/mmbiz_jpg/Sv6neLWjnqoDmgoBDfG7VIYxxU7qwwA4F2dqsVoOfbFxddicmlhd2s5LlJXEx7YPKjZRapOBibMuyzz9bKXXAwww/0?wx_fmt=jpeg","url":"https://mp.weixin.qq.com/s?src=11&timestamp=1543280411&ver=1269&signature=0kL2rzleFgd72vLJc-HuuYOCSJZpElbmsFFEdVKH-FL-IjE83VQSy1x5imZ90DKmgtEphNO5HwfAVC6AHUnwiZOFW4UeaJNzx9PCsrTbHvkLCVA3jVUe-W4i8NCLVxMd&new=1"}]
     */

    private int code;
    private String msg;
    private List<NewslistBean> newslist;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<?> getNewslist() {
        return newslist;
    }

    public void setNewslist(List<NewslistBean> newslist) {
        this.newslist = newslist;
    }

    public static class NewslistBean {
        /**
         * ctime : 2018-11-27
         * title : |必读|汝之蜜糖彼之砒霜:FDA警告1岁内婴儿不宜喂食蜂蜜
         * description : 全球医生组织
         * picUrl : http://mmbiz.qpic.cn/mmbiz_jpg/E88Sm1WX6Y6yh2cbRiaQeOJEjCPNWGqxibdD7cibVaIiaEEeI7JtwZGIwuhAqvvzvUaKxKqN0ZRPnWhibIkmbvm6HVw/0?wx_fmt=jpeg
         * url : https://mp.weixin.qq.com/s?src=11&timestamp=1543280403&ver=1269&signature=XMCKhVJmNyDwdpH-fs9XbxtP9QfraUp5EcXHGu8Orr5L5H0wIjmiCiS3I16pNanOvlfhA*Tv3tLBlhR*MP0zpeHYyBHrb4Y7r6IFQtkiI51jufWhTr6YAVbxnmfKxrbW&new=1
         */

        private String ctime;
        private String title;
        private String description;
        private String picUrl;
        private String url;

        public String getCtime() {
            return ctime;
        }

        public void setCtime(String ctime) {
            this.ctime = ctime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getDescription() {
            return description;
        }

        public void setDescription(String description) {
            this.description = description;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
}
