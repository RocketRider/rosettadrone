/* AUTO-GENERATED FILE.  DO NOT MODIFY.
 *
 * This class was automatically generated by the
 * java mavlink generator tool. It should not be modified by hand.
 */

// MESSAGE SYS_STATUS PACKING
package com.MAVLink.common;

import com.MAVLink.MAVLinkPacket;
import com.MAVLink.Messages.MAVLinkMessage;
import com.MAVLink.Messages.MAVLinkPayload;

/**
 * The general system state. If the system is following the MAVLink standard, the system state is mainly defined by three orthogonal states/modes: The system mode, which is either LOCKED (motors shut down and locked), MANUAL (system under RC control), GUIDED (system with autonomous position control, position setpoint controlled manually) or AUTO (system guided by path/waypoint planner). The NAV_MODE defined the current flight state: LIFTOFF (often an open-loop maneuver), LANDING, WAYPOINTS or VECTOR. This represents the internal navigation state machine. The system status shows whether the system is currently active or not and if an emergency occured. During the CRITICAL and EMERGENCY states the MAV is still considered to be active, but should start emergency procedures autonomously. After a failure occured it should first move from active to critical to allow manual intervention and then move to emergency after a certain timeout.
 */
public class msg_sys_status extends MAVLinkMessage {

    public static final int MAVLINK_MSG_ID_SYS_STATUS = 1;
    public static final int MAVLINK_MSG_LENGTH = 31;
    private static final long serialVersionUID = MAVLINK_MSG_ID_SYS_STATUS;


    /**
     * Bitmask showing which onboard controllers and sensors are present. Value of 0: not present. Value of 1: present. Indices defined by ENUM MAV_SYS_STATUS_SENSOR
     */
    public long onboard_control_sensors_present;

    /**
     * Bitmask showing which onboard controllers and sensors are enabled:  Value of 0: not enabled. Value of 1: enabled. Indices defined by ENUM MAV_SYS_STATUS_SENSOR
     */
    public long onboard_control_sensors_enabled;

    /**
     * Bitmask showing which onboard controllers and sensors are operational or have an error:  Value of 0: not enabled. Value of 1: enabled. Indices defined by ENUM MAV_SYS_STATUS_SENSOR
     */
    public long onboard_control_sensors_health;

    /**
     * Maximum usage in percent of the mainloop time, (0%: 0, 100%: 1000) should be always below 1000
     */
    public int load;

    /**
     * Battery voltage, in millivolts (1 = 1 millivolt)
     */
    public int voltage_battery;

    /**
     * Battery current, in 10*milliamperes (1 = 10 milliampere), -1: autopilot does not measure the current
     */
    public short current_battery;

    /**
     * Communication drops in percent, (0%: 0, 100%: 10'000), (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)
     */
    public int drop_rate_comm;

    /**
     * Communication errors (UART, I2C, SPI, CAN), dropped packets on all links (packets that were corrupted on reception on the MAV)
     */
    public int errors_comm;

    /**
     * Autopilot-specific errors
     */
    public int errors_count1;

    /**
     * Autopilot-specific errors
     */
    public int errors_count2;

    /**
     * Autopilot-specific errors
     */
    public int errors_count3;

    /**
     * Autopilot-specific errors
     */
    public int errors_count4;

    /**
     * Remaining battery energy: (0%: 0, 100%: 100), -1: autopilot estimate the remaining battery
     */
    public byte battery_remaining;


    /**
     * Constructor for a new message, just initializes the msgid
     */
    public msg_sys_status() {
        msgid = MAVLINK_MSG_ID_SYS_STATUS;
    }

    /**
     * Constructor for a new message, initializes the message with the payload
     * from a mavlink packet
     */
    public msg_sys_status(MAVLinkPacket mavLinkPacket) {
        this.sysid = mavLinkPacket.sysid;
        this.compid = mavLinkPacket.compid;
        this.msgid = MAVLINK_MSG_ID_SYS_STATUS;
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
        packet.msgid = MAVLINK_MSG_ID_SYS_STATUS;

        packet.payload.putUnsignedInt(onboard_control_sensors_present);

        packet.payload.putUnsignedInt(onboard_control_sensors_enabled);

        packet.payload.putUnsignedInt(onboard_control_sensors_health);

        packet.payload.putUnsignedShort(load);

        packet.payload.putUnsignedShort(voltage_battery);

        packet.payload.putShort(current_battery);

        packet.payload.putUnsignedShort(drop_rate_comm);

        packet.payload.putUnsignedShort(errors_comm);

        packet.payload.putUnsignedShort(errors_count1);

        packet.payload.putUnsignedShort(errors_count2);

        packet.payload.putUnsignedShort(errors_count3);

        packet.payload.putUnsignedShort(errors_count4);

        packet.payload.putByte(battery_remaining);

        return packet;
    }

    /**
     * Decode a sys_status message into this class fields
     *
     * @param payload The message to decode
     */
    public void unpack(MAVLinkPayload payload) {
        payload.resetIndex();

        this.onboard_control_sensors_present = payload.getUnsignedInt();

        this.onboard_control_sensors_enabled = payload.getUnsignedInt();

        this.onboard_control_sensors_health = payload.getUnsignedInt();

        this.load = payload.getUnsignedShort();

        this.voltage_battery = payload.getUnsignedShort();

        this.current_battery = payload.getShort();

        this.drop_rate_comm = payload.getUnsignedShort();

        this.errors_comm = payload.getUnsignedShort();

        this.errors_count1 = payload.getUnsignedShort();

        this.errors_count2 = payload.getUnsignedShort();

        this.errors_count3 = payload.getUnsignedShort();

        this.errors_count4 = payload.getUnsignedShort();

        this.battery_remaining = payload.getByte();

    }

    /**
     * Returns a string with the MSG name and data
     */
    public String toString() {
        return "MAVLINK_MSG_ID_SYS_STATUS - sysid:" + sysid + " compid:" + compid + " onboard_control_sensors_present:" + onboard_control_sensors_present + " onboard_control_sensors_enabled:" + onboard_control_sensors_enabled + " onboard_control_sensors_health:" + onboard_control_sensors_health + " load:" + load + " voltage_battery:" + voltage_battery + " current_battery:" + current_battery + " drop_rate_comm:" + drop_rate_comm + " errors_comm:" + errors_comm + " errors_count1:" + errors_count1 + " errors_count2:" + errors_count2 + " errors_count3:" + errors_count3 + " errors_count4:" + errors_count4 + " battery_remaining:" + battery_remaining + "";
    }
}
        