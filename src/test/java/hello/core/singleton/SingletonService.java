package hello.core.singleton;

public class SingletonService {

    //static
    private static final SingletonService instance = new SingletonService();

    // Open it as public and allow a call only through this static method
    // if an object instance is required
    public static SingletonService getInstance() {
        return instance;
    }

    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
