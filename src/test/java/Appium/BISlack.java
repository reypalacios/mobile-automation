package appium;

import in.ashwanthkumar.slack.webhook.Slack;
import in.ashwanthkumar.slack.webhook.SlackMessage;

import java.io.IOException;

/**
 * Created by rpalacios on 4/18/16.
 */
public class BISlack {
    public static void sendMessage(String message) throws IOException {
        Boolean slackNotification = Boolean.valueOf(new PropertyReader().readProperty("slackNotification"));
        if (slackNotification)
            new Slack("https://hooks.slack.com/services/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").icon(":smiling_imp:").push(new SlackMessage(message));
    }
}
