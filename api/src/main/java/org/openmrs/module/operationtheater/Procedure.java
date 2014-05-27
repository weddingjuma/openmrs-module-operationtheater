package org.openmrs.module.operationtheater;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openmrs.BaseOpenmrsData;

import javax.persistence.*;

/**
 * Defines a Procedure in the system.
 */
@Entity
@Table(name = "procedure")
 public class Procedure extends BaseOpenmrsData{

	private static final Log log = LogFactory.getLog(Procedure.class);

	@Id
	@GeneratedValue
	@Column(name = "procedure_id")
	private int procedureId;

	@Basic
	@Column(name = "name")
	private String name;

	@Basic
	@Column(name = "description")
	private String description;

	/**
	 * average timespan in minutes required to perform this procedure
	 */
	@Basic
	@Column(name = "intervention_duration")
	private Integer interventionDuration;

	/**
	 * average timespan in minutes required to prepare the operation theater
	 * for this particular procedure
	 */
	@Basic
	@Column(name = "ot_preparation_duration")
	private Integer otPreparationDuration;

	/**
	 * average number of days the patient has to stay in the hospital
	 * after this procedure
	 */
	@Basic
	@Column(name = "inpatient_stay")
	private Integer inpatientStay;

	public int getProcedureId() {
		return procedureId;
	}

	public void setProcedureId(int procedureId) {
		this.procedureId = procedureId;
	}

	@Override
	public Integer getId() {
		return getProcedureId();
	}

	@Override
	public void setId(Integer id) {
		setProcedureId(id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getInterventionDuration() {
		return interventionDuration;
	}

	public void setInterventionDuration(Integer interventionDuration) {
		this.interventionDuration = interventionDuration;
	}

	public Integer getOtPreparationDuration() {
		return otPreparationDuration;
	}

	public void setOtPreparationDuration(Integer otPreparationDuration) {
		this.otPreparationDuration = otPreparationDuration;
	}

	public int getInpatientStay() {
		return inpatientStay;
	}

	public void setInpatientStay(int inpatientStay) {
		this.inpatientStay = inpatientStay;
	}

}
