/**
 *  This file is part of MythTV Service API for Java
 * 
 *  MythTV Service API for Java is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  MythTV Service API for Java is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with MythTV Service API for Java.  If not, see <http://www.gnu.org/licenses/>.
 *   
 * This software can be found at <https://github.com/tafypz/MythTV-Service-API.git>
 *
 */
package com.masdaussel.mythtv.services.api.myth;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author sebastien
 * 
 */
public class LogMessage {

	@JsonProperty("HostName")
	private String	hostname;

	@JsonProperty("Application")
	private String	application;

	@JsonProperty("PID")
	private int		pid;

	@JsonProperty("TID")
	private int		tid;

	@JsonProperty("Thread")
	private String	thread;

	@JsonProperty("Filename")
	private String	filename;

	@JsonProperty("Line")
	private int		line;

	@JsonProperty("Function")
	private String	function;

	@JsonProperty("Time")
	private Date	time;

	@JsonProperty("Level")
	private String	level;

	@JsonProperty("Message")
	private String	message;

	public LogMessage() {
	}

	/**
	 * @return the application
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * @return the filename
	 */
	public String getFilename() {
		return filename;
	}

	/**
	 * @return the function
	 */
	public String getFunction() {
		return function;
	}

	/**
	 * @return the hostname
	 */
	public String getHostname() {
		return hostname;
	}

	/**
	 * @return the level
	 */
	public String getLevel() {
		return level;
	}

	/**
	 * @return the line
	 */
	public int getLine() {
		return line;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @return the thread
	 */
	public String getThread() {
		return thread;
	}

	/**
	 * @return the tid
	 */
	public int getTid() {
		return tid;
	}

	/**
	 * @return the time
	 */
	public Date getTime() {
		return time;
	}

	/**
	 * @param application
	 *            the application to set
	 */
	public void setApplication(final String application) {
		this.application = application;
	}

	/**
	 * @param filename
	 *            the filename to set
	 */
	public void setFilename(final String filename) {
		this.filename = filename;
	}

	/**
	 * @param function
	 *            the function to set
	 */
	public void setFunction(final String function) {
		this.function = function;
	}

	/**
	 * @param hostname
	 *            the hostname to set
	 */
	public void setHostname(final String hostname) {
		this.hostname = hostname;
	}

	/**
	 * @param level
	 *            the level to set
	 */
	public void setLevel(final String level) {
		this.level = level;
	}

	/**
	 * @param line
	 *            the line to set
	 */
	public void setLine(final int line) {
		this.line = line;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @param pid
	 *            the pid to set
	 */
	public void setPid(final int pid) {
		this.pid = pid;
	}

	/**
	 * @param thread
	 *            the thread to set
	 */
	public void setThread(final String thread) {
		this.thread = thread;
	}

	/**
	 * @param tid
	 *            the tid to set
	 */
	public void setTid(final int tid) {
		this.tid = tid;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(final Date time) {
		this.time = time;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		final StringBuilder builder = new StringBuilder();

		builder.append("LogMessage [");

		if (hostname != null) {
			builder.append("hostname=");
			builder.append(hostname);
			builder.append(", ");
		}

		if (application != null) {
			builder.append("application=");
			builder.append(application);
			builder.append(", ");
		}

		builder.append("pid=");
		builder.append(pid);
		builder.append(", tid=");
		builder.append(tid);
		builder.append(", ");

		if (thread != null) {
			builder.append("thread=");
			builder.append(thread);
			builder.append(", ");
		}

		if (filename != null) {
			builder.append("filename=");
			builder.append(filename);
			builder.append(", ");
		}

		builder.append("line=");
		builder.append(line);
		builder.append(", ");

		if (function != null) {
			builder.append("function=");
			builder.append(function);
			builder.append(", ");
		}

		if (time != null) {
			builder.append("time=");
			builder.append(time);
			builder.append(", ");
		}

		if (level != null) {
			builder.append("level=");
			builder.append(level);
			builder.append(", ");
		}

		if (message != null) {
			builder.append("message=");
			builder.append(message);
		}

		builder.append("]");

		return builder.toString();
	}

}
