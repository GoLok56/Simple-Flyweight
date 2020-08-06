package io.golok56.github;

import java.util.HashMap;
import java.util.Map;

public class ChatFactory {
    private Map<String, Chat> cache = new HashMap<>();

    public Chat createChat(String intent) {
        Chat chat = cache.get(intent);
        if (chat == null) {
            switch (intent) {
                case "confirmation":
                    chat = new PaymentConfirmationChat();
                    break;
                case "product":
                    chat = new ProductChat();
                    break;
                default:
                    chat = new WelcomeChat();
            }

            if (chat instanceof ProductChat) ((ProductChat) chat).setProducts(new String[]{"Ayam", "Sate", "Kambing"});
            else if (chat instanceof PaymentConfirmationChat) ((PaymentConfirmationChat) chat).setOrderNum("112156");

            cache.put(intent, chat);
        }
        return chat;
    }
}