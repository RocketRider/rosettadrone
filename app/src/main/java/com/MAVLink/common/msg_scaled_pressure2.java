/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SCALED_PRESSURE2 PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * Barometer readings for 2nd barometer
 */
public class msg_scaled_pressure2 extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SCALED_PRESSURE2 = 137;
    public static final int MAVLINK_MSG_LENGTH = 14;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SCALED_PRESSURE2;


    /**
     * Timestamp (milliseconds since system boot)
     */
    public long time_boot_ms;

    /**
     * Absolute pressure (hectopascal)
     */
    public float press_abs;

    /**
     * Differential pressure 1 (hectopascal)
     */
    public float press_diff;

    /**
     * Temperature measurement (0.01 degrees celsius)
     */
    public short temperature;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_scaled_pressure2() {
        msgid = MAVLINK_MSG_ID_SCALED_PRESSURE2;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_scaled_pressure2(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE2;
        unpack(mavLinkPacket.payload);
    }

    /**
     * Generates the payload for a mavlink message for a message of this type
     *
     * @return
     */
    public MAVLinkPacket pack() {
        MAVLinkPacket packet = new MAVLinkPacket(MAVLINK_MSG_LENGTH);
        packet.sysid = 255;
        packet.compid = 190;
        packet.msgid = MAVLINK_MSG_ID_SCALED_PRESSURE2;

        packet.payload.putUnsignedInt(time_boot_ms);

        packet.payload.putFloat(press_abs);

        packet.payload.putFloat(press_diff);

        packet.payload.putShort(temperature);

        return packet;
    }

    /**
     * Decode a scaled_pressure2 message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.time_boot_ms = payload.getUnsignedInt();

        this.press_abs = payload.getFloat();

        this.press_diff = payload.getFloat();

        this.temperature = payload.getShort();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_SCALED_PRESSURE2 - sysid:" + sysid + " compid:" + compid + " time_boot_ms:" + time_boot_ms + " press_abs:" + press_abs + " press_diff:" + press_diff + " temperature:" + temperature + "";
    }
}
        