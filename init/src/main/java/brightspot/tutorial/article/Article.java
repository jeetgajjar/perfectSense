package brightspot.tutorial.article;

import brightspot.tutorial.image.Image;

import com.psddev.cms.db.Content;
import com.psddev.cms.db.Directory;
import com.psddev.cms.db.Site;
import com.psddev.cms.db.ToolUi;
import com.psddev.dari.db.Recordable;
import com.psddev.dari.util.StringUtils;

import java.util.Date;

public class Article extends Content implements Directory.Item {

    @Recordable.Required
    private String headline;

    @ToolUi.RichText
    private String body;

    private Image leadImage;

    private String author;

    private Date date;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Image getLeadImage() {
        return leadImage;
    }

    public void setLeadImage(Image leadImage) {
        this.leadImage = leadImage;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String createPermalink(Site site) {
        return StringUtils.toNormalized(getHeadline());
    }

}
