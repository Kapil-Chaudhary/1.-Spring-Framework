package com.bharath.spring.springcore.reftypes;

public class Scores {

	private Double chemistry;
	private Double maths;
	private Double physics;
	

	public Double getMaths() {
		return maths;
	}

	public void setMaths(Double maths) {
		this.maths = maths;
	}

	public Double getPhysics() {
		return physics;
	}

	public void setPhysics(Double physics) {
		this.physics = physics;
	}

	public Double getChemistry() {
		return chemistry;
	}

	public void setChemistry(Double chemistry) {
		this.chemistry = chemistry;
	}

	@Override
	public String toString() {
		return "Scores [chemistry=" + chemistry + ", maths=" + maths + ", physics=" + physics + "]";
	}
	
	
	
	

}
