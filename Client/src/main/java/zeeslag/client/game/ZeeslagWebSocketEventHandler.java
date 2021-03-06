package zeeslag.client.game;

import zeeslag.shared.HitType;
import zeeslag.shared.Ship;

public class ZeeslagWebSocketEventHandler implements ZeeslagWebSocketEventListener {

    private final ZeeslagGameImpl zeeslagGame;


    ZeeslagWebSocketEventHandler(ZeeslagGameImpl zeeslagGame) {
        this.zeeslagGame = zeeslagGame;
    }


    @Override
    public void onAttackResult(int to, int x, int y, HitType hitType) {
        zeeslagGame.onAttackResult(to, x, y, hitType);
    }


    @Override
    public void onReady() {
        zeeslagGame.notifyWhenReady();
    }


    @Override
    public void onStart() {
        zeeslagGame.startGame();
    }


    @Override
    public void onReset() {
        zeeslagGame.onReset();
    }


    @Override
    public void onPlaceShips(int userId, Ship[] ships) {
        throw new IllegalStateException("Client shouldn't get ship placement events when not in spectator mode");
    }

}
