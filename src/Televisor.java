public class Televisor {
    boolean turn;   // domyślnie wartość boolean jest false więc nie trzeba jej ustawiać

    void turnOn() {
        turn = true;
    }

    void turnOff() {
        turn = false;
    }

    void showStatus() {
        System.out.println(this.turn);
    }
}
