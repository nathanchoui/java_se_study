package personal.nathan.others;

import java.util.Iterator;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;

/**
 * Description:
 *
 * Created by zhangwei on 2018/5/29.
 */
public class Test {

    private void parseVideoXml(String xml) {
        Document doc = null;
//        video.setVideoTracking();
//        video.setCreativeUrl();
//        video.setDuration();
//        video.setHeight();
//        video.setWidth();
//        video.setTitle();
//        video.setKeepSecond();
//        video.setBackgroundImage();
//        video.setType();

        try {
            doc = DocumentHelper.parseText(xml);
            Element inLineElement = doc.getRootElement().element("Ad").element("InLine");
            for (Iterator<Element> it = inLineElement.elementIterator("Impression"); it.hasNext();) {
                System.out.println(it.next().getText());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 00:00:30 -> 30
     * 01:23:23 ->
     *
     * @param timeStr
     * @return
     */
    private int getTime(String timeStr) {
//        if (StringUtils.isEmpty(timeStr)) {
//            return 0;
//        }
        String[] times = timeStr.split(":");
        if (times == null || times.length != 3) {
            return 0;
        }
        int hour = Integer.parseInt(times[0]);
        int minute = Integer.parseInt(times[1]);
        int sec = Integer.parseInt(times[2]);
        return hour * 60 * 60 + minute * 60 + sec;
    }

    public static void main(String[] args) {
//        String xml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n"
//            + "<VAST version=\"2.0\">\n"
//            + "\t<Ad id=\"12345\">\n"
//            + "\t\t<InLine>\n"
//            + "\t\t\t<AdSystem version=\"1.0\">SpotXchange</AdSystem>\n"
//            + "\t\t\t<AdTitle>\n"
//            + "\t\t\t\t<![CDATA[SampleVAST]]>\n"
//            + "\t\t\t</AdTitle>\n"
//            + "\t\t\t<Impression>http://sample.com1</Impression>\n"
//            + "\t\t\t<Impression>http://sample.com2</Impression>\n"
//            + "\t\t\t<Description>\n"
//            + "\t\t\t\t<![CDATA[A sample VAST feed]]>\n"
//            + "\t\t\t</Description>\n"
//            + "\t\t\t<Creatives>\n"
//            + "\t\t\t\t<Creative sequence=\"1\" id=\"1\">\n"
//            + "\t\t\t\t\t<Linear>\n"
//            + "\t\t\t\t\t\t<Duration>00:00:30</Duration>\n"
//            + "\t\t\t\t\t\t<TrackingEvents></TrackingEvents>\n"
//            + "\t\t\t\t\t\t<VideoClicks>\n"
//            + "\t\t\t\t\t\t\t<ClickThrough>\n"
//            + "\t\t\t\t\t\t\t\t<![CDATA[http://sample.com/openrtbtest]]>\n"
//            + "\t\t\t\t\t\t\t</ClickThrough>\n"
//            + "\t\t\t\t\t\t</VideoClicks>\n"
//            + "\t\t\t\t\t\t<MediaFiles>\n"
//            + "\t\t\t\t\t\t\t<MediaFile delivery=\"progressive\" bitrate=\"256\" width=\"640\" height=\"480\" type=\"video/mp4\">\n"
//            + "\t\t\t\t\t\t\t\t<![CDATA[http://sample.com/video.mp4]]>\n"
//            + "\t\t\t\t\t\t\t</MediaFile>\n"
//            + "\t\t\t\t\t\t</MediaFiles>\n"
//            + "\t\t\t\t\t</Linear>\n"
//            + "\t\t\t\t</Creative>\n"
//            + "\t\t\t</Creatives>\n"
//            + "\t\t</InLine>\n"
//            + "\t</Ad>\n"
//            + "</VAST>";
//
//        new Test().parseVideoXml(xml);


        System.out.println(new Test().getTime("01:12:23"));
    }

}
