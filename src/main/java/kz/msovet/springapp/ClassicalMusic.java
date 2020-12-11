package kz.msovet.springapp;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        System.out.println("AHHAHAHHAH");
        return new ClassicalMusic();
    }

    public void onInit() {
        System.out.println("Doing my inititialization");
    }

    public void onDestroy() {
        System.out.println("Destroy!!!!");
    }

    @Override
    public String getSong() {
        return "Bethovennin oleni";
    }
}
