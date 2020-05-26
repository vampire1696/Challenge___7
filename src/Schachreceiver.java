import java.io.Exception;
public class Schachreceiver {
    void receiveDice(int number) throws IOException ;

    void receiveSurrender() throws IOException;
    void receivemove(int from,int to);
    void receiveproposalAnswer(
            boolean accept
    );
    void receiveendGame(
            int reason
    );


}
