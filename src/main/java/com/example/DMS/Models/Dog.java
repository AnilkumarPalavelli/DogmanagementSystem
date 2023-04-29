/**
 * 
 */
package com.example.DMS.Models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author S549406
 *
 */

@Entity
public class Dog {
	@Id
	private int id;
	private String name;
	private String breed;
	@ManyToOne
	private Trainer trainer;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}
	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}
	/**
	 * @return the trainer
	 */
	public Trainer getTrainer() {
		return trainer;
	}
	/**
	 * @param trainer the trainer to set
	 */
	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}
	@Override
	public String toString() {
		return "Dog [id=" + id + ", name=" + name + ", breed=" + breed + ", trainer=" + trainer + "]";
	}
		

}
