/*-
 *******************************************************************************
 * Copyright (c) 2015 Diamond Light Source Ltd.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * This file was auto-generated from the NXDL XML definition.
 * Generated at: 2015-11-11T16:27:56.219Z
 *******************************************************************************/

package org.eclipse.dawnsci.nexus.impl;

import java.util.Date;
import java.util.Set;
import java.util.EnumSet;
import java.util.Map;

import org.eclipse.dawnsci.analysis.api.dataset.IDataset;
import org.eclipse.dawnsci.analysis.dataset.impl.Dataset;

import org.eclipse.dawnsci.nexus.*;

/**
 * Template of a detector, detector bank, or multidetector.
 * 
 * @version 1.1
 */
public class NXdetectorImpl extends NXobjectImpl implements NXdetector {

	private static final long serialVersionUID = 1L;  // no state in this class, so always compatible

	public static final String NX_TIME_OF_FLIGHT = "time_of_flight";
	public static final String NX_TIME_OF_FLIGHT_ATTRIBUTE_AXIS = "axis";
	public static final String NX_TIME_OF_FLIGHT_ATTRIBUTE_PRIMARY = "primary";
	public static final String NX_TIME_OF_FLIGHT_ATTRIBUTE_LONG_NAME = "long_name";
	public static final String NX_RAW_TIME_OF_FLIGHT = "raw_time_of_flight";
	public static final String NX_RAW_TIME_OF_FLIGHT_ATTRIBUTE_FREQUENCY = "frequency";
	public static final String NX_DETECTOR_NUMBER = "detector_number";
	public static final String NX_DATA = "data";
	public static final String NX_DATA_ATTRIBUTE_SIGNAL = "signal";
	public static final String NX_DATA_ATTRIBUTE_AXES = "axes";
	public static final String NX_DATA_ATTRIBUTE_LONG_NAME = "long_name";
	public static final String NX_DATA_ATTRIBUTE_CHECK_SUM = "check_sum";
	public static final String NX_DATA_ERROR = "data_error";
	public static final String NX_X_PIXEL_OFFSET = "x_pixel_offset";
	public static final String NX_X_PIXEL_OFFSET_ATTRIBUTE_AXIS = "axis";
	public static final String NX_X_PIXEL_OFFSET_ATTRIBUTE_PRIMARY = "primary";
	public static final String NX_X_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME = "long_name";
	public static final String NX_Y_PIXEL_OFFSET = "y_pixel_offset";
	public static final String NX_Y_PIXEL_OFFSET_ATTRIBUTE_AXIS = "axis";
	public static final String NX_Y_PIXEL_OFFSET_ATTRIBUTE_PRIMARY = "primary";
	public static final String NX_Y_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME = "long_name";
	public static final String NX_DISTANCE = "distance";
	public static final String NX_POLAR_ANGLE = "polar_angle";
	public static final String NX_AZIMUTHAL_ANGLE = "azimuthal_angle";
	public static final String NX_DESCRIPTION = "description";
	public static final String NX_LOCAL_NAME = "local_name";
	public static final String NX_SOLID_ANGLE = "solid_angle";
	public static final String NX_X_PIXEL_SIZE = "x_pixel_size";
	public static final String NX_Y_PIXEL_SIZE = "y_pixel_size";
	public static final String NX_DEAD_TIME = "dead_time";
	public static final String NX_GAS_PRESSURE = "gas_pressure";
	public static final String NX_DETECTION_GAS_PATH = "detection_gas_path";
	public static final String NX_CRATE = "crate";
	public static final String NX_CRATE_ATTRIBUTE_LOCAL_NAME = "local_name";
	public static final String NX_SLOT = "slot";
	public static final String NX_SLOT_ATTRIBUTE_LOCAL_NAME = "local_name";
	public static final String NX_INPUT = "input";
	public static final String NX_INPUT_ATTRIBUTE_LOCAL_NAME = "local_name";
	public static final String NX_TYPE = "type";
	public static final String NX_CALIBRATION_DATE = "calibration_date";
	public static final String NX_LAYOUT = "layout";
	public static final String NX_COUNT_TIME = "count_time";
	public static final String NX_SEQUENCE_NUMBER = "sequence_number";
	public static final String NX_BEAM_CENTER_X = "beam_center_x";
	public static final String NX_BEAM_CENTER_Y = "beam_center_y";
	public static final String NX_FRAME_START_NUMBER = "frame_start_number";
	public static final String NX_DIAMETER = "diameter";
	public static final String NX_ACQUISITION_MODE = "acquisition_mode";
	public static final String NX_ANGULAR_CALIBRATION_APPLIED = "angular_calibration_applied";
	public static final String NX_ANGULAR_CALIBRATION = "angular_calibration";
	public static final String NX_FLATFIELD_APPLIED = "flatfield_applied";
	public static final String NX_FLATFIELD = "flatfield";
	public static final String NX_FLATFIELD_ERROR = "flatfield_error";
	public static final String NX_PIXEL_MASK_APPLIED = "pixel_mask_applied";
	public static final String NX_PIXEL_MASK = "pixel_mask";
	public static final String NX_COUNTRATE_CORRECTION__APPLIED = "countrate_correction__applied";
	public static final String NX_BIT_DEPTH_READOUT = "bit_depth_readout";
	public static final String NX_DETECTOR_READOUT_TIME = "detector_readout_time";
	public static final String NX_TRIGGER_DELAY_TIME = "trigger_delay_time";
	public static final String NX_TRIGGER_DEAD_TIME = "trigger_dead_time";
	public static final String NX_FRAME_TIME = "frame_time";
	public static final String NX_GAIN_SETTING = "gain_setting";
	public static final String NX_SATURATION_VALUE = "saturation_value";
	public static final String NX_NUMBER_OF_CYCLES = "number_of_cycles";
	public static final String NX_SENSOR_MATERIAL = "sensor_material";
	public static final String NX_SENSOR_THICKNESS = "sensor_thickness";
	public static final String NX_THRESHOLD_ENERGY = "threshold_energy";

	public static final Set<NexusBaseClass> PERMITTED_CHILD_GROUP_CLASSES = EnumSet.of(
		NexusBaseClass.NX_GEOMETRY,
		NexusBaseClass.NX_DATA,
		NexusBaseClass.NX_NOTE,
		NexusBaseClass.NX_NOTE,
		NexusBaseClass.NX_CHARACTERIZATION,
		NexusBaseClass.NX_COLLECTION,
		NexusBaseClass.NX_DETECTOR_MODULE);

	protected NXdetectorImpl(final NexusNodeFactory nodeFactory) {
		super(nodeFactory);
	}

	protected NXdetectorImpl(final long oid) {
		super(oid);
	}
	
	@Override
	public Class<? extends NXobject> getNXclass() {
		return NXdetector.class;
	}
	
	@Override
	public NexusBaseClass getNexusBaseClass() {
		return NexusBaseClass.NX_DETECTOR;
	}
	
	@Override
	public Set<NexusBaseClass> getPermittedChildGroupClasses() {
		return PERMITTED_CHILD_GROUP_CLASSES;
	}
	

	@Override
	public IDataset getTime_of_flight() {
		return getDataset(NX_TIME_OF_FLIGHT);
	}

	@Override
	public double getTime_of_flightScalar() {
		return getDouble(NX_TIME_OF_FLIGHT);
	}

	public void setTime_of_flight(IDataset time_of_flight) {
		setDataset(NX_TIME_OF_FLIGHT, time_of_flight);
	}

	public void setTime_of_flightScalar(double time_of_flight) {
		setField(NX_TIME_OF_FLIGHT, time_of_flight);
	}

	@Override
	public long getTime_of_flightAttributeAxis() {
		return getAttrLong(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_AXIS);
	}

	public void setTime_of_flightAttributeAxis(long axis) {
		setAttribute(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_AXIS, axis);
	}

	@Override
	public long getTime_of_flightAttributePrimary() {
		return getAttrLong(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_PRIMARY);
	}

	public void setTime_of_flightAttributePrimary(long primary) {
		setAttribute(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_PRIMARY, primary);
	}

	@Override
	public String getTime_of_flightAttributeLong_name() {
		return getAttrString(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_LONG_NAME);
	}

	public void setTime_of_flightAttributeLong_name(String long_name) {
		setAttribute(NX_TIME_OF_FLIGHT, NX_TIME_OF_FLIGHT_ATTRIBUTE_LONG_NAME, long_name);
	}

	@Override
	public IDataset getRaw_time_of_flight() {
		return getDataset(NX_RAW_TIME_OF_FLIGHT);
	}

	@Override
	public long getRaw_time_of_flightScalar() {
		return getLong(NX_RAW_TIME_OF_FLIGHT);
	}

	public void setRaw_time_of_flight(IDataset raw_time_of_flight) {
		setDataset(NX_RAW_TIME_OF_FLIGHT, raw_time_of_flight);
	}

	public void setRaw_time_of_flightScalar(long raw_time_of_flight) {
		setField(NX_RAW_TIME_OF_FLIGHT, raw_time_of_flight);
	}

	@Override
	public Number getRaw_time_of_flightAttributeFrequency() {
		return getAttrNumber(NX_RAW_TIME_OF_FLIGHT, NX_RAW_TIME_OF_FLIGHT_ATTRIBUTE_FREQUENCY);
	}

	public void setRaw_time_of_flightAttributeFrequency(Number frequency) {
		setAttribute(NX_RAW_TIME_OF_FLIGHT, NX_RAW_TIME_OF_FLIGHT_ATTRIBUTE_FREQUENCY, frequency);
	}

	@Override
	public IDataset getDetector_number() {
		return getDataset(NX_DETECTOR_NUMBER);
	}

	@Override
	public long getDetector_numberScalar() {
		return getLong(NX_DETECTOR_NUMBER);
	}

	public void setDetector_number(IDataset detector_number) {
		setDataset(NX_DETECTOR_NUMBER, detector_number);
	}

	public void setDetector_numberScalar(long detector_number) {
		setField(NX_DETECTOR_NUMBER, detector_number);
	}

	@Override
	public IDataset getData() {
		return getDataset(NX_DATA);
	}

	@Override
	public Number getDataScalar() {
		return getNumber(NX_DATA);
	}

	public void setData(IDataset data) {
		setDataset(NX_DATA, data);
	}

	public void setDataScalar(Number data) {
		setField(NX_DATA, data);
	}

	@Override
	public long getDataAttributeSignal() {
		return getAttrLong(NX_DATA, NX_DATA_ATTRIBUTE_SIGNAL);
	}

	public void setDataAttributeSignal(long signal) {
		setAttribute(NX_DATA, NX_DATA_ATTRIBUTE_SIGNAL, signal);
	}

	@Override
	public String getDataAttributeAxes() {
		return getAttrString(NX_DATA, NX_DATA_ATTRIBUTE_AXES);
	}

	public void setDataAttributeAxes(String axes) {
		setAttribute(NX_DATA, NX_DATA_ATTRIBUTE_AXES, axes);
	}

	@Override
	public String getDataAttributeLong_name() {
		return getAttrString(NX_DATA, NX_DATA_ATTRIBUTE_LONG_NAME);
	}

	public void setDataAttributeLong_name(String long_name) {
		setAttribute(NX_DATA, NX_DATA_ATTRIBUTE_LONG_NAME, long_name);
	}

	@Override
	public long getDataAttributeCheck_sum() {
		return getAttrLong(NX_DATA, NX_DATA_ATTRIBUTE_CHECK_SUM);
	}

	public void setDataAttributeCheck_sum(long check_sum) {
		setAttribute(NX_DATA, NX_DATA_ATTRIBUTE_CHECK_SUM, check_sum);
	}

	@Override
	public IDataset getData_error() {
		return getDataset(NX_DATA_ERROR);
	}

	@Override
	public Number getData_errorScalar() {
		return getNumber(NX_DATA_ERROR);
	}

	public void setData_error(IDataset data_error) {
		setDataset(NX_DATA_ERROR, data_error);
	}

	public void setData_errorScalar(Number data_error) {
		setField(NX_DATA_ERROR, data_error);
	}

	@Override
	public IDataset getX_pixel_offset() {
		return getDataset(NX_X_PIXEL_OFFSET);
	}

	@Override
	public double getX_pixel_offsetScalar() {
		return getDouble(NX_X_PIXEL_OFFSET);
	}

	public void setX_pixel_offset(IDataset x_pixel_offset) {
		setDataset(NX_X_PIXEL_OFFSET, x_pixel_offset);
	}

	public void setX_pixel_offsetScalar(double x_pixel_offset) {
		setField(NX_X_PIXEL_OFFSET, x_pixel_offset);
	}

	@Override
	public long getX_pixel_offsetAttributeAxis() {
		return getAttrLong(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_AXIS);
	}

	public void setX_pixel_offsetAttributeAxis(long axis) {
		setAttribute(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_AXIS, axis);
	}

	@Override
	public long getX_pixel_offsetAttributePrimary() {
		return getAttrLong(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_PRIMARY);
	}

	public void setX_pixel_offsetAttributePrimary(long primary) {
		setAttribute(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_PRIMARY, primary);
	}

	@Override
	public String getX_pixel_offsetAttributeLong_name() {
		return getAttrString(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME);
	}

	public void setX_pixel_offsetAttributeLong_name(String long_name) {
		setAttribute(NX_X_PIXEL_OFFSET, NX_X_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME, long_name);
	}

	@Override
	public IDataset getY_pixel_offset() {
		return getDataset(NX_Y_PIXEL_OFFSET);
	}

	@Override
	public double getY_pixel_offsetScalar() {
		return getDouble(NX_Y_PIXEL_OFFSET);
	}

	public void setY_pixel_offset(IDataset y_pixel_offset) {
		setDataset(NX_Y_PIXEL_OFFSET, y_pixel_offset);
	}

	public void setY_pixel_offsetScalar(double y_pixel_offset) {
		setField(NX_Y_PIXEL_OFFSET, y_pixel_offset);
	}

	@Override
	public long getY_pixel_offsetAttributeAxis() {
		return getAttrLong(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_AXIS);
	}

	public void setY_pixel_offsetAttributeAxis(long axis) {
		setAttribute(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_AXIS, axis);
	}

	@Override
	public long getY_pixel_offsetAttributePrimary() {
		return getAttrLong(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_PRIMARY);
	}

	public void setY_pixel_offsetAttributePrimary(long primary) {
		setAttribute(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_PRIMARY, primary);
	}

	@Override
	public String getY_pixel_offsetAttributeLong_name() {
		return getAttrString(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME);
	}

	public void setY_pixel_offsetAttributeLong_name(String long_name) {
		setAttribute(NX_Y_PIXEL_OFFSET, NX_Y_PIXEL_OFFSET_ATTRIBUTE_LONG_NAME, long_name);
	}

	@Override
	public IDataset getDistance() {
		return getDataset(NX_DISTANCE);
	}

	@Override
	public double getDistanceScalar() {
		return getDouble(NX_DISTANCE);
	}

	public void setDistance(IDataset distance) {
		setDataset(NX_DISTANCE, distance);
	}

	public void setDistanceScalar(double distance) {
		setField(NX_DISTANCE, distance);
	}

	@Override
	public IDataset getPolar_angle() {
		return getDataset(NX_POLAR_ANGLE);
	}

	@Override
	public double getPolar_angleScalar() {
		return getDouble(NX_POLAR_ANGLE);
	}

	public void setPolar_angle(IDataset polar_angle) {
		setDataset(NX_POLAR_ANGLE, polar_angle);
	}

	public void setPolar_angleScalar(double polar_angle) {
		setField(NX_POLAR_ANGLE, polar_angle);
	}

	@Override
	public IDataset getAzimuthal_angle() {
		return getDataset(NX_AZIMUTHAL_ANGLE);
	}

	@Override
	public double getAzimuthal_angleScalar() {
		return getDouble(NX_AZIMUTHAL_ANGLE);
	}

	public void setAzimuthal_angle(IDataset azimuthal_angle) {
		setDataset(NX_AZIMUTHAL_ANGLE, azimuthal_angle);
	}

	public void setAzimuthal_angleScalar(double azimuthal_angle) {
		setField(NX_AZIMUTHAL_ANGLE, azimuthal_angle);
	}

	@Override
	public IDataset getDescription() {
		return getDataset(NX_DESCRIPTION);
	}

	@Override
	public String getDescriptionScalar() {
		return getString(NX_DESCRIPTION);
	}

	public void setDescription(IDataset description) {
		setDataset(NX_DESCRIPTION, description);
	}

	public void setDescriptionScalar(String description) {
		setString(NX_DESCRIPTION, description);
	}

	@Override
	public IDataset getLocal_name() {
		return getDataset(NX_LOCAL_NAME);
	}

	@Override
	public String getLocal_nameScalar() {
		return getString(NX_LOCAL_NAME);
	}

	public void setLocal_name(IDataset local_name) {
		setDataset(NX_LOCAL_NAME, local_name);
	}

	public void setLocal_nameScalar(String local_name) {
		setString(NX_LOCAL_NAME, local_name);
	}

	@Override
	public NXgeometry getGeometry() {
		return getChild("geometry", NXgeometry.class);
	}

	public void setGeometry(NXgeometry geometry) {
		putChild("geometry", geometry);
	}

	@Override
	public NXgeometry getGeometry(String name) {
		return getChild(name, NXgeometry.class);
	}

	public void setGeometry(String name, NXgeometry geometry) {
		putChild(name, geometry);
	}

	@Override
	public Map<String, NXgeometry> getAllGeometry() {
		return getChildren(NXgeometry.class);
	}

	public void setAllGeometry(Map<String, NXgeometry> geometry) {
		setChildren(geometry);
	}

	@Override
	public IDataset getSolid_angle() {
		return getDataset(NX_SOLID_ANGLE);
	}

	@Override
	public double getSolid_angleScalar() {
		return getDouble(NX_SOLID_ANGLE);
	}

	public void setSolid_angle(IDataset solid_angle) {
		setDataset(NX_SOLID_ANGLE, solid_angle);
	}

	public void setSolid_angleScalar(double solid_angle) {
		setField(NX_SOLID_ANGLE, solid_angle);
	}

	@Override
	public IDataset getX_pixel_size() {
		return getDataset(NX_X_PIXEL_SIZE);
	}

	@Override
	public double getX_pixel_sizeScalar() {
		return getDouble(NX_X_PIXEL_SIZE);
	}

	public void setX_pixel_size(IDataset x_pixel_size) {
		setDataset(NX_X_PIXEL_SIZE, x_pixel_size);
	}

	public void setX_pixel_sizeScalar(double x_pixel_size) {
		setField(NX_X_PIXEL_SIZE, x_pixel_size);
	}

	@Override
	public IDataset getY_pixel_size() {
		return getDataset(NX_Y_PIXEL_SIZE);
	}

	@Override
	public double getY_pixel_sizeScalar() {
		return getDouble(NX_Y_PIXEL_SIZE);
	}

	public void setY_pixel_size(IDataset y_pixel_size) {
		setDataset(NX_Y_PIXEL_SIZE, y_pixel_size);
	}

	public void setY_pixel_sizeScalar(double y_pixel_size) {
		setField(NX_Y_PIXEL_SIZE, y_pixel_size);
	}

	@Override
	public IDataset getDead_time() {
		return getDataset(NX_DEAD_TIME);
	}

	@Override
	public double getDead_timeScalar() {
		return getDouble(NX_DEAD_TIME);
	}

	public void setDead_time(IDataset dead_time) {
		setDataset(NX_DEAD_TIME, dead_time);
	}

	public void setDead_timeScalar(double dead_time) {
		setField(NX_DEAD_TIME, dead_time);
	}

	@Override
	public IDataset getGas_pressure() {
		return getDataset(NX_GAS_PRESSURE);
	}

	@Override
	public double getGas_pressureScalar() {
		return getDouble(NX_GAS_PRESSURE);
	}

	public void setGas_pressure(IDataset gas_pressure) {
		setDataset(NX_GAS_PRESSURE, gas_pressure);
	}

	public void setGas_pressureScalar(double gas_pressure) {
		setField(NX_GAS_PRESSURE, gas_pressure);
	}

	@Override
	public IDataset getDetection_gas_path() {
		return getDataset(NX_DETECTION_GAS_PATH);
	}

	@Override
	public double getDetection_gas_pathScalar() {
		return getDouble(NX_DETECTION_GAS_PATH);
	}

	public void setDetection_gas_path(IDataset detection_gas_path) {
		setDataset(NX_DETECTION_GAS_PATH, detection_gas_path);
	}

	public void setDetection_gas_pathScalar(double detection_gas_path) {
		setField(NX_DETECTION_GAS_PATH, detection_gas_path);
	}

	@Override
	public IDataset getCrate() {
		return getDataset(NX_CRATE);
	}

	@Override
	public long getCrateScalar() {
		return getLong(NX_CRATE);
	}

	public void setCrate(IDataset crate) {
		setDataset(NX_CRATE, crate);
	}

	public void setCrateScalar(long crate) {
		setField(NX_CRATE, crate);
	}

	@Override
	public String getCrateAttributeLocal_name() {
		return getAttrString(NX_CRATE, NX_CRATE_ATTRIBUTE_LOCAL_NAME);
	}

	public void setCrateAttributeLocal_name(String local_name) {
		setAttribute(NX_CRATE, NX_CRATE_ATTRIBUTE_LOCAL_NAME, local_name);
	}

	@Override
	public IDataset getSlot() {
		return getDataset(NX_SLOT);
	}

	@Override
	public long getSlotScalar() {
		return getLong(NX_SLOT);
	}

	public void setSlot(IDataset slot) {
		setDataset(NX_SLOT, slot);
	}

	public void setSlotScalar(long slot) {
		setField(NX_SLOT, slot);
	}

	@Override
	public String getSlotAttributeLocal_name() {
		return getAttrString(NX_SLOT, NX_SLOT_ATTRIBUTE_LOCAL_NAME);
	}

	public void setSlotAttributeLocal_name(String local_name) {
		setAttribute(NX_SLOT, NX_SLOT_ATTRIBUTE_LOCAL_NAME, local_name);
	}

	@Override
	public IDataset getInput() {
		return getDataset(NX_INPUT);
	}

	@Override
	public long getInputScalar() {
		return getLong(NX_INPUT);
	}

	public void setInput(IDataset input) {
		setDataset(NX_INPUT, input);
	}

	public void setInputScalar(long input) {
		setField(NX_INPUT, input);
	}

	@Override
	public String getInputAttributeLocal_name() {
		return getAttrString(NX_INPUT, NX_INPUT_ATTRIBUTE_LOCAL_NAME);
	}

	public void setInputAttributeLocal_name(String local_name) {
		setAttribute(NX_INPUT, NX_INPUT_ATTRIBUTE_LOCAL_NAME, local_name);
	}

	@Override
	public IDataset getType() {
		return getDataset(NX_TYPE);
	}

	@Override
	public String getTypeScalar() {
		return getString(NX_TYPE);
	}

	public void setType(IDataset type) {
		setDataset(NX_TYPE, type);
	}

	public void setTypeScalar(String type) {
		setString(NX_TYPE, type);
	}

	@Override
	public NXdata getEfficiency() {
		return getChild("efficiency", NXdata.class);
	}

	public void setEfficiency(NXdata efficiency) {
		putChild("efficiency", efficiency);
	}

	@Override
	public IDataset getCalibration_date() {
		return getDataset(NX_CALIBRATION_DATE);
	}

	@Override
	public Date getCalibration_dateScalar() {
		return getDate(NX_CALIBRATION_DATE);
	}

	public void setCalibration_date(IDataset calibration_date) {
		setDataset(NX_CALIBRATION_DATE, calibration_date);
	}

	public void setCalibration_dateScalar(Date calibration_date) {
		setDate(NX_CALIBRATION_DATE, calibration_date);
	}

	@Override
	public NXnote getCalibration_method() {
		return getChild("calibration_method", NXnote.class);
	}

	public void setCalibration_method(NXnote calibration_method) {
		putChild("calibration_method", calibration_method);
	}

	@Override
	public IDataset getLayout() {
		return getDataset(NX_LAYOUT);
	}

	@Override
	public String getLayoutScalar() {
		return getString(NX_LAYOUT);
	}

	public void setLayout(IDataset layout) {
		setDataset(NX_LAYOUT, layout);
	}

	public void setLayoutScalar(String layout) {
		setString(NX_LAYOUT, layout);
	}

	@Override
	public IDataset getCount_time() {
		return getDataset(NX_COUNT_TIME);
	}

	@Override
	public Number getCount_timeScalar() {
		return getNumber(NX_COUNT_TIME);
	}

	public void setCount_time(IDataset count_time) {
		setDataset(NX_COUNT_TIME, count_time);
	}

	public void setCount_timeScalar(Number count_time) {
		setField(NX_COUNT_TIME, count_time);
	}

	@Override
	public NXnote getData_file() {
		return getChild("data_file", NXnote.class);
	}

	public void setData_file(NXnote data_file) {
		putChild("data_file", data_file);
	}

	@Override
	@Deprecated
	public NXcharacterization getCharacterization() {
		return getChild("characterization", NXcharacterization.class);
	}

	@Deprecated
	public void setCharacterization(NXcharacterization characterization) {
		putChild("characterization", characterization);
	}

	@Override
	@Deprecated
	public NXcharacterization getCharacterization(String name) {
		return getChild(name, NXcharacterization.class);
	}

	@Deprecated
	public void setCharacterization(String name, NXcharacterization characterization) {
		putChild(name, characterization);
	}

	@Override
	@Deprecated
	public Map<String, NXcharacterization> getAllCharacterization() {
		return getChildren(NXcharacterization.class);
	}

	@Deprecated
	public void setAllCharacterization(Map<String, NXcharacterization> characterization) {
		setChildren(characterization);
	}

	@Override
	public NXcollection getCollection() {
		return getChild("collection", NXcollection.class);
	}

	public void setCollection(NXcollection collection) {
		putChild("collection", collection);
	}

	@Override
	public NXcollection getCollection(String name) {
		return getChild(name, NXcollection.class);
	}

	public void setCollection(String name, NXcollection collection) {
		putChild(name, collection);
	}

	@Override
	public Map<String, NXcollection> getAllCollection() {
		return getChildren(NXcollection.class);
	}

	public void setAllCollection(Map<String, NXcollection> collection) {
		setChildren(collection);
	}

	@Override
	public IDataset getSequence_number() {
		return getDataset(NX_SEQUENCE_NUMBER);
	}

	@Override
	public String getSequence_numberScalar() {
		return getString(NX_SEQUENCE_NUMBER);
	}

	public void setSequence_number(IDataset sequence_number) {
		setDataset(NX_SEQUENCE_NUMBER, sequence_number);
	}

	public void setSequence_numberScalar(String sequence_number) {
		setString(NX_SEQUENCE_NUMBER, sequence_number);
	}

	@Override
	public IDataset getBeam_center_x() {
		return getDataset(NX_BEAM_CENTER_X);
	}

	@Override
	public double getBeam_center_xScalar() {
		return getDouble(NX_BEAM_CENTER_X);
	}

	public void setBeam_center_x(IDataset beam_center_x) {
		setDataset(NX_BEAM_CENTER_X, beam_center_x);
	}

	public void setBeam_center_xScalar(double beam_center_x) {
		setField(NX_BEAM_CENTER_X, beam_center_x);
	}

	@Override
	public IDataset getBeam_center_y() {
		return getDataset(NX_BEAM_CENTER_Y);
	}

	@Override
	public double getBeam_center_yScalar() {
		return getDouble(NX_BEAM_CENTER_Y);
	}

	public void setBeam_center_y(IDataset beam_center_y) {
		setDataset(NX_BEAM_CENTER_Y, beam_center_y);
	}

	public void setBeam_center_yScalar(double beam_center_y) {
		setField(NX_BEAM_CENTER_Y, beam_center_y);
	}

	@Override
	public IDataset getFrame_start_number() {
		return getDataset(NX_FRAME_START_NUMBER);
	}

	@Override
	public long getFrame_start_numberScalar() {
		return getLong(NX_FRAME_START_NUMBER);
	}

	public void setFrame_start_number(IDataset frame_start_number) {
		setDataset(NX_FRAME_START_NUMBER, frame_start_number);
	}

	public void setFrame_start_numberScalar(long frame_start_number) {
		setField(NX_FRAME_START_NUMBER, frame_start_number);
	}

	@Override
	public IDataset getDiameter() {
		return getDataset(NX_DIAMETER);
	}

	@Override
	public double getDiameterScalar() {
		return getDouble(NX_DIAMETER);
	}

	public void setDiameter(IDataset diameter) {
		setDataset(NX_DIAMETER, diameter);
	}

	public void setDiameterScalar(double diameter) {
		setField(NX_DIAMETER, diameter);
	}

	@Override
	public IDataset getAcquisition_mode() {
		return getDataset(NX_ACQUISITION_MODE);
	}

	@Override
	public String getAcquisition_modeScalar() {
		return getString(NX_ACQUISITION_MODE);
	}

	public void setAcquisition_mode(IDataset acquisition_mode) {
		setDataset(NX_ACQUISITION_MODE, acquisition_mode);
	}

	public void setAcquisition_modeScalar(String acquisition_mode) {
		setString(NX_ACQUISITION_MODE, acquisition_mode);
	}

	@Override
	public IDataset getAngular_calibration_applied() {
		return getDataset(NX_ANGULAR_CALIBRATION_APPLIED);
	}

	@Override
	public boolean getAngular_calibration_appliedScalar() {
		return getBoolean(NX_ANGULAR_CALIBRATION_APPLIED);
	}

	public void setAngular_calibration_applied(IDataset angular_calibration_applied) {
		setDataset(NX_ANGULAR_CALIBRATION_APPLIED, angular_calibration_applied);
	}

	public void setAngular_calibration_appliedScalar(boolean angular_calibration_applied) {
		setField(NX_ANGULAR_CALIBRATION_APPLIED, angular_calibration_applied);
	}

	@Override
	public IDataset getAngular_calibration() {
		return getDataset(NX_ANGULAR_CALIBRATION);
	}

	@Override
	public double getAngular_calibrationScalar() {
		return getDouble(NX_ANGULAR_CALIBRATION);
	}

	public void setAngular_calibration(IDataset angular_calibration) {
		setDataset(NX_ANGULAR_CALIBRATION, angular_calibration);
	}

	public void setAngular_calibrationScalar(double angular_calibration) {
		setField(NX_ANGULAR_CALIBRATION, angular_calibration);
	}

	@Override
	public IDataset getFlatfield_applied() {
		return getDataset(NX_FLATFIELD_APPLIED);
	}

	@Override
	public boolean getFlatfield_appliedScalar() {
		return getBoolean(NX_FLATFIELD_APPLIED);
	}

	public void setFlatfield_applied(IDataset flatfield_applied) {
		setDataset(NX_FLATFIELD_APPLIED, flatfield_applied);
	}

	public void setFlatfield_appliedScalar(boolean flatfield_applied) {
		setField(NX_FLATFIELD_APPLIED, flatfield_applied);
	}

	@Override
	public IDataset getFlatfield() {
		return getDataset(NX_FLATFIELD);
	}

	@Override
	public double getFlatfieldScalar() {
		return getDouble(NX_FLATFIELD);
	}

	public void setFlatfield(IDataset flatfield) {
		setDataset(NX_FLATFIELD, flatfield);
	}

	public void setFlatfieldScalar(double flatfield) {
		setField(NX_FLATFIELD, flatfield);
	}

	@Override
	public IDataset getFlatfield_error() {
		return getDataset(NX_FLATFIELD_ERROR);
	}

	@Override
	public double getFlatfield_errorScalar() {
		return getDouble(NX_FLATFIELD_ERROR);
	}

	public void setFlatfield_error(IDataset flatfield_error) {
		setDataset(NX_FLATFIELD_ERROR, flatfield_error);
	}

	public void setFlatfield_errorScalar(double flatfield_error) {
		setField(NX_FLATFIELD_ERROR, flatfield_error);
	}

	@Override
	public IDataset getPixel_mask_applied() {
		return getDataset(NX_PIXEL_MASK_APPLIED);
	}

	@Override
	public boolean getPixel_mask_appliedScalar() {
		return getBoolean(NX_PIXEL_MASK_APPLIED);
	}

	public void setPixel_mask_applied(IDataset pixel_mask_applied) {
		setDataset(NX_PIXEL_MASK_APPLIED, pixel_mask_applied);
	}

	public void setPixel_mask_appliedScalar(boolean pixel_mask_applied) {
		setField(NX_PIXEL_MASK_APPLIED, pixel_mask_applied);
	}

	@Override
	public IDataset getPixel_mask() {
		return getDataset(NX_PIXEL_MASK);
	}

	@Override
	public long getPixel_maskScalar() {
		return getLong(NX_PIXEL_MASK);
	}

	public void setPixel_mask(IDataset pixel_mask) {
		setDataset(NX_PIXEL_MASK, pixel_mask);
	}

	public void setPixel_maskScalar(long pixel_mask) {
		setField(NX_PIXEL_MASK, pixel_mask);
	}

	@Override
	public IDataset getCountrate_correction__applied() {
		return getDataset(NX_COUNTRATE_CORRECTION__APPLIED);
	}

	@Override
	public boolean getCountrate_correction__appliedScalar() {
		return getBoolean(NX_COUNTRATE_CORRECTION__APPLIED);
	}

	public void setCountrate_correction__applied(IDataset countrate_correction__applied) {
		setDataset(NX_COUNTRATE_CORRECTION__APPLIED, countrate_correction__applied);
	}

	public void setCountrate_correction__appliedScalar(boolean countrate_correction__applied) {
		setField(NX_COUNTRATE_CORRECTION__APPLIED, countrate_correction__applied);
	}

	@Override
	public IDataset getBit_depth_readout() {
		return getDataset(NX_BIT_DEPTH_READOUT);
	}

	@Override
	public long getBit_depth_readoutScalar() {
		return getLong(NX_BIT_DEPTH_READOUT);
	}

	public void setBit_depth_readout(IDataset bit_depth_readout) {
		setDataset(NX_BIT_DEPTH_READOUT, bit_depth_readout);
	}

	public void setBit_depth_readoutScalar(long bit_depth_readout) {
		setField(NX_BIT_DEPTH_READOUT, bit_depth_readout);
	}

	@Override
	public IDataset getDetector_readout_time() {
		return getDataset(NX_DETECTOR_READOUT_TIME);
	}

	@Override
	public double getDetector_readout_timeScalar() {
		return getDouble(NX_DETECTOR_READOUT_TIME);
	}

	public void setDetector_readout_time(IDataset detector_readout_time) {
		setDataset(NX_DETECTOR_READOUT_TIME, detector_readout_time);
	}

	public void setDetector_readout_timeScalar(double detector_readout_time) {
		setField(NX_DETECTOR_READOUT_TIME, detector_readout_time);
	}

	@Override
	public IDataset getTrigger_delay_time() {
		return getDataset(NX_TRIGGER_DELAY_TIME);
	}

	@Override
	public double getTrigger_delay_timeScalar() {
		return getDouble(NX_TRIGGER_DELAY_TIME);
	}

	public void setTrigger_delay_time(IDataset trigger_delay_time) {
		setDataset(NX_TRIGGER_DELAY_TIME, trigger_delay_time);
	}

	public void setTrigger_delay_timeScalar(double trigger_delay_time) {
		setField(NX_TRIGGER_DELAY_TIME, trigger_delay_time);
	}

	@Override
	public IDataset getTrigger_dead_time() {
		return getDataset(NX_TRIGGER_DEAD_TIME);
	}

	@Override
	public double getTrigger_dead_timeScalar() {
		return getDouble(NX_TRIGGER_DEAD_TIME);
	}

	public void setTrigger_dead_time(IDataset trigger_dead_time) {
		setDataset(NX_TRIGGER_DEAD_TIME, trigger_dead_time);
	}

	public void setTrigger_dead_timeScalar(double trigger_dead_time) {
		setField(NX_TRIGGER_DEAD_TIME, trigger_dead_time);
	}

	@Override
	public IDataset getFrame_time() {
		return getDataset(NX_FRAME_TIME);
	}

	@Override
	public double getFrame_timeScalar() {
		return getDouble(NX_FRAME_TIME);
	}

	public void setFrame_time(IDataset frame_time) {
		setDataset(NX_FRAME_TIME, frame_time);
	}

	public void setFrame_timeScalar(double frame_time) {
		setField(NX_FRAME_TIME, frame_time);
	}

	@Override
	public IDataset getGain_setting() {
		return getDataset(NX_GAIN_SETTING);
	}

	@Override
	public String getGain_settingScalar() {
		return getString(NX_GAIN_SETTING);
	}

	public void setGain_setting(IDataset gain_setting) {
		setDataset(NX_GAIN_SETTING, gain_setting);
	}

	public void setGain_settingScalar(String gain_setting) {
		setString(NX_GAIN_SETTING, gain_setting);
	}

	@Override
	public IDataset getSaturation_value() {
		return getDataset(NX_SATURATION_VALUE);
	}

	@Override
	public long getSaturation_valueScalar() {
		return getLong(NX_SATURATION_VALUE);
	}

	public void setSaturation_value(IDataset saturation_value) {
		setDataset(NX_SATURATION_VALUE, saturation_value);
	}

	public void setSaturation_valueScalar(long saturation_value) {
		setField(NX_SATURATION_VALUE, saturation_value);
	}

	@Override
	public IDataset getNumber_of_cycles() {
		return getDataset(NX_NUMBER_OF_CYCLES);
	}

	@Override
	public long getNumber_of_cyclesScalar() {
		return getLong(NX_NUMBER_OF_CYCLES);
	}

	public void setNumber_of_cycles(IDataset number_of_cycles) {
		setDataset(NX_NUMBER_OF_CYCLES, number_of_cycles);
	}

	public void setNumber_of_cyclesScalar(long number_of_cycles) {
		setField(NX_NUMBER_OF_CYCLES, number_of_cycles);
	}

	@Override
	public IDataset getSensor_material() {
		return getDataset(NX_SENSOR_MATERIAL);
	}

	@Override
	public String getSensor_materialScalar() {
		return getString(NX_SENSOR_MATERIAL);
	}

	public void setSensor_material(IDataset sensor_material) {
		setDataset(NX_SENSOR_MATERIAL, sensor_material);
	}

	public void setSensor_materialScalar(String sensor_material) {
		setString(NX_SENSOR_MATERIAL, sensor_material);
	}

	@Override
	public IDataset getSensor_thickness() {
		return getDataset(NX_SENSOR_THICKNESS);
	}

	@Override
	public double getSensor_thicknessScalar() {
		return getDouble(NX_SENSOR_THICKNESS);
	}

	public void setSensor_thickness(IDataset sensor_thickness) {
		setDataset(NX_SENSOR_THICKNESS, sensor_thickness);
	}

	public void setSensor_thicknessScalar(double sensor_thickness) {
		setField(NX_SENSOR_THICKNESS, sensor_thickness);
	}

	@Override
	public IDataset getThreshold_energy() {
		return getDataset(NX_THRESHOLD_ENERGY);
	}

	@Override
	public double getThreshold_energyScalar() {
		return getDouble(NX_THRESHOLD_ENERGY);
	}

	public void setThreshold_energy(IDataset threshold_energy) {
		setDataset(NX_THRESHOLD_ENERGY, threshold_energy);
	}

	public void setThreshold_energyScalar(double threshold_energy) {
		setField(NX_THRESHOLD_ENERGY, threshold_energy);
	}

	@Override
	public NXdetector_module getDetector_module() {
		return getChild("detector_module", NXdetector_module.class);
	}

	public void setDetector_module(NXdetector_module detector_module) {
		putChild("detector_module", detector_module);
	}

	@Override
	public NXdetector_module getDetector_module(String name) {
		return getChild(name, NXdetector_module.class);
	}

	public void setDetector_module(String name, NXdetector_module detector_module) {
		putChild(name, detector_module);
	}

	@Override
	public Map<String, NXdetector_module> getAllDetector_module() {
		return getChildren(NXdetector_module.class);
	}

	public void setAllDetector_module(Map<String, NXdetector_module> detector_module) {
		setChildren(detector_module);
	}

}
