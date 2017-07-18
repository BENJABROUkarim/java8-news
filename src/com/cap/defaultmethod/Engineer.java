/**
 * @author kbenjabr 18 juil. 2017/11:19:15 Software Engineer At Capgemini Morocco
 *
 */
package com.cap.defaultmethod;

public class Engineer implements SoftwareEngineer {

	@Override
	public void grade() {
		System.out.println("mon grade est A");
	}

	@Override
	public void print() {
		System.out.println("hello i'am a software enginneer");
	}

}
