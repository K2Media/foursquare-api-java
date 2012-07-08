package fi.foyt.foursquare.api.entities.notifications;

import fi.foyt.foursquare.api.FoursquareEntity;
import fi.foyt.foursquare.api.entities.Source;

public class ReplyNotification implements FoursquareEntity {

    private static final long serialVersionUID = -437944825189805309L;

    public String getText() {
        return text;
    }

    public Source getSource() {
        return source;
    }

    public String getContentId() {
        return contentId;
    }

    public String getUrl() {
        return url;
    }

    private String text;
    private Source source;
    private String contentId;
    private String url;
}
