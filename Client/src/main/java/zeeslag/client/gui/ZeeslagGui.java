/*
 * Sea Battle Start project.
 */
package zeeslag.client.gui;

import zeeslag.shared.HitType;

/**
 * Interface provided by the graphical user interface of the sea battle game.
 *
 * @author Nico Kuijpers
 */
public interface ZeeslagGui {

    /**
     * Set player number.
     *
     * @param playerNr identification of player
     * @param name     player's name
     */
    void setPlayerNumber(int playerNr, String name);

    /**
     * Notification that the game has started.
     *
     * @param playerNr identification of player
     */
    void notifyStartGame(int playerNr);

    void waitForOtherPlayerToBeReady();

    /**
     * Communicate the result of a shot fired by the player.
     * The result of the shot will be one of the following:
     * MISSED  - No ship was hit
     * HIT     - A ship was hit
     * SUNK    - A ship was sunk
     * ALL_SUNK - All ships are sunk
     *
     * @param playerNr identification of player
     * @param shotType result of shot fired by player
     */
    void playerFiresShot(int playerNr, HitType shotType);

    /**
     * Communicate the result of a shot fired by the opponent.
     * The result of the shot will be one of the following:
     * MISSED  - No ship was hit
     * HIT     - A ship was hit
     * SUNK    - A ship was sunk
     * ALL_SUNK - All ships are sunk
     *
     * @param playerNr identification of player
     * @param shotType result of shot fired by opponent
     */
    void opponentFiresShot(int playerNr, HitType shotType);

    /**
     * Show state of a square in the ocean area.
     * The new state of the square will be shown in the area where
     * the ships of the player are placed (ocean area).
     *
     * @param playerNr    identification of player
     * @param posX        x-position of square
     * @param posY        y-position of square
     * @param squareState state of square
     */
    void showSquarePlayer(int playerNr, int posX, int posY, SquareState squareState);

    /**
     * Show state of a square in the target area.
     * The new state of the square will be shown in the area where
     * the ships of the opponent are placed (target area)
     *
     * @param playerNr    identification of player
     * @param posX        x-position of square
     * @param posY        y-position of square
     * @param squareState state of square
     */
    void showSquareOpponent(int playerNr, int posX, int posY, SquareState squareState);

    /**
     * Show error message.
     *
     * @param errorMessage error message
     */
    void showErrorMessage(String errorMessage);
}
