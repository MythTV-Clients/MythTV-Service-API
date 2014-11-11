MythTV-Service-API
==================

MythTV Service API Library for Java

Implementation of MythTV .27 Services API for Java

Basic building block for MythTV oriented applications in the Java realm.

org.mythtv.services.api.ServerVersionQuery should be used to get the backend version number:

> 1. Check if the server is reachable:
    <pre><code>boolean isReachable = org.mythtv.services.api.ServerVersionQuery.isServerReachable("http://backendIP:backendPort(Typically 6544)");</code></pre>

> 2. Get the server version
    <pre><code>ApiVersion version = org.mythtv.services.api.ServerVersionQuery.getMythVersion("http://backendIP:backendPort(Typically 6544)");</code></pre>

> 3. Build the MythTVApiContext:
    <pre><code>MythTvApi027Context ctxt = (MythTvApiContext)MythTvApiContext.newBuilder().setHostName("192.168.0.2").setVersion(ApiVersion.v027).build();</code></pre>
