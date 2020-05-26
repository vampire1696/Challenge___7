public interface Schachsender {
    void dice(int number);
    void move(
            int from,
            int to
    );
    void movePawnRule(
            int from,
            int figureType
    );
    void rochade(
            int from
    );
    void endGame(
            int reason
    );
    void proposalEnd(
            int reason
    );
    void proposalAnswer(
            boolean accept
    );







}
