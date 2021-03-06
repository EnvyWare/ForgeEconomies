package com.envyful.economies.api;

import com.envyful.api.database.leaderboard.SQLLeaderboard;

/**
 *
 * Represents an economy on the server
 *
 */
public interface Economy {

    /**
     *
     * The identifier of the economy
     *
     * @return The identifier
     */
    String getId();

    /**
     *
     * Gets the display name of the Economy
     *
     * @return the display name
     */
    String getDisplayName();

    /**
     *
     * Gets the plural display name
     *
     * @return Plural display name
     */
    String getDisplayNamePlural();

    /**
     *
     * Gets the identifier for the economy
     *
     * @return The identifier
     */
    String getEconomyIdentifier();

    /**
     *
     * Economy string format
     *
     * @return Format
     */
    String getFormat();

    /**
     *
     * Determines if the identifier is a prefix or suffix
     *
     * @return True = prefix
     */
    boolean isPrefix();

    /**
     *
     * Gets the default value
     *
     * @return The default value
     */
    double getDefaultValue();

    /**
     *
     * Gets the minimum pay amount
     *
     * @return Minimum pay amount
     */
    double getMinimumPayAmount();

    /**
     *
     * If this economy is the server's default
     *
     * @return Is this default economy
     */
    boolean isDefault();

    /**
     *
     * Gets the leaderboard for this {@link Economy}
     *
     * @return The leaderboard handler
     */
    SQLLeaderboard getLeaderboard();

}
