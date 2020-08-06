package io.golok56.github;

public class FlyweightDemo {
    public static void main(String[] args) {
        Chat chat = ChatFactory.createChat("confirmation");
        System.out.println(chat.getResponseText());

        chat = ChatFactory.createChat("product");
        System.out.println(chat.getResponseText());

        chat = ChatFactory.createChat("confirmation");
        System.out.println(chat.getResponseText());

        chat = ChatFactory.createChat("welcome");
        System.out.println(chat.getResponseText());
    }
}
