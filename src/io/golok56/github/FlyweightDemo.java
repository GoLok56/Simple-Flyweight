package io.golok56.github;

public class FlyweightDemo {
    public static void main(String[] args) {
        ChatFactory chatFactory = new ChatFactory();

        Chat chat = chatFactory.createChat("confirmation");
        System.out.println(chat.getResponseText());

        chat = chatFactory.createChat("product");
        System.out.println(chat.getResponseText());

        chat = chatFactory.createChat("confirmation");
        System.out.println(chat.getResponseText());

        chat = chatFactory.createChat("welcome");
        System.out.println(chat.getResponseText());
    }
}
