package org.mythtv.services.api.v026.beans;

import org.joda.time.DateTime;
import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

/**
 * @author Daniel Frey
 *
 */
@Root( name = "Status" )
public class BackendStatus {

	@Attribute
	private String version;
	
	@Attribute( name = "ISODate" )
	private DateTime isoDate;
	
	@Attribute( name = "protoVer" )
	private int protocolVersion;
	
	@Attribute
	private String time;
	
	@Attribute
	private String date;
	
	@Element( name = "Encoders" )
	private Encoders encoders;
	
	@Element( name = "Scheduled" )
	private Scheduled scheduled;
	
	@Element( name = "Frontends" )
	private Frontends frontends;
	
	@Element( name = "Backends" )
	private Backends backends;
	
	@Element( name = "JobQueue" )
	private JobQueue jobQueue;
	
	@Element( name = "MachineInfo" )
	private MachineInfo machineInfo;
	
	@Element( name = "Miscellaneous", required = false )
	private Miscellaneous miscellaneous;
	
	public BackendStatus() { }

	/**
	 * @return the version
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * @param version the version to set
	 */
	public void setVersion( String version ) {
		this.version = version;
	}

	/**
	 * @return the isoDate
	 */
	public DateTime getIsoDate() {
		return isoDate;
	}

	/**
	 * @param isoDate the isoDate to set
	 */
	public void setIsoDate( DateTime isoDate ) {
		this.isoDate = isoDate;
	}

	/**
	 * @return the protocolVersion
	 */
	public int getProtocolVersion() {
		return protocolVersion;
	}

	/**
	 * @param protocolVersion the protocolVersion to set
	 */
	public void setProtocolVersion( int protocolVersion ) {
		this.protocolVersion = protocolVersion;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime( String time ) {
		this.time = time;
	}

	/**
	 * @return the date
	 */
	public String getDate() {
		return date;
	}

	/**
	 * @param date the date to set
	 */
	public void setDate( String date ) {
		this.date = date;
	}

	/**
	 * @return the encoders
	 */
	public Encoders getEncoders() {
		return encoders;
	}

	/**
	 * @param encoders the encoders to set
	 */
	public void setEncoders( Encoders encoders ) {
		this.encoders = encoders;
	}

	/**
	 * @return the scheduled
	 */
	public Scheduled getScheduled() {
		return scheduled;
	}

	/**
	 * @param scheduled the scheduled to set
	 */
	public void setScheduled( Scheduled scheduled ) {
		this.scheduled = scheduled;
	}

	/**
	 * @return the frontends
	 */
	public Frontends getFrontends() {
		return frontends;
	}

	/**
	 * @param frontends the frontends to set
	 */
	public void setFrontends( Frontends frontends ) {
		this.frontends = frontends;
	}

	/**
	 * @return the backends
	 */
	public Backends getBackends() {
		return backends;
	}

	/**
	 * @param backends the backends to set
	 */
	public void setBackends( Backends backends ) {
		this.backends = backends;
	}

	/**
	 * @return the jobQueue
	 */
	public JobQueue getJobQueue() {
		return jobQueue;
	}

	/**
	 * @param jobQueue the jobQueue to set
	 */
	public void setJobQueue( JobQueue jobQueue ) {
		this.jobQueue = jobQueue;
	}

	/**
	 * @return the machineInfo
	 */
	public MachineInfo getMachineInfo() {
		return machineInfo;
	}

	/**
	 * @param machineInfo the machineInfo to set
	 */
	public void setMachineInfo( MachineInfo machineInfo ) {
		this.machineInfo = machineInfo;
	}

	/**
	 * @return the miscellaneous
	 */
	public Miscellaneous getMiscellaneous() {
		return miscellaneous;
	}

	/**
	 * @param miscellaneous the miscellaneous to set
	 */
	public void setMiscellaneous( Miscellaneous miscellaneous ) {
		this.miscellaneous = miscellaneous;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append( "Status [" );
		if( version != null ) {
			builder.append( "version=" );
			builder.append( version );
			builder.append( ", " );
		}
		if( isoDate != null ) {
			builder.append( "isoDate=" );
			builder.append( isoDate );
			builder.append( ", " );
		}
		builder.append( "protocolVersion=" );
		builder.append( protocolVersion );
		builder.append( ", " );
		if( time != null ) {
			builder.append( "time=" );
			builder.append( time );
			builder.append( ", " );
		}
		if( date != null ) {
			builder.append( "date=" );
			builder.append( date );
			builder.append( ", " );
		}
		if( encoders != null ) {
			builder.append( "encoders=" );
			builder.append( encoders );
			builder.append( ", " );
		}
		if( scheduled != null ) {
			builder.append( "scheduled=" );
			builder.append( scheduled );
			builder.append( ", " );
		}
		if( frontends != null ) {
			builder.append( "frontends=" );
			builder.append( frontends );
			builder.append( ", " );
		}
		if( backends != null ) {
			builder.append( "backends=" );
			builder.append( backends );
			builder.append( ", " );
		}
		if( jobQueue != null ) {
			builder.append( "jobQueue=" );
			builder.append( jobQueue );
			builder.append( ", " );
		}
		if( machineInfo != null ) {
			builder.append( "machineInfo=" );
			builder.append( machineInfo );
			builder.append( ", " );
		}
		if( miscellaneous != null ) {
			builder.append( "miscellaneous=" );
			builder.append( miscellaneous );
		}
		builder.append( "]" );
		return builder.toString();
	}
	
}
