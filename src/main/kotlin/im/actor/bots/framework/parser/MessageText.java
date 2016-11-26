package im.actor.bots.framework.parser;

import im.actor.bots.framework.parser.ParsedMessage;

public class MessageText extends ParsedMessage {

    final private String text;

    public MessageText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}
