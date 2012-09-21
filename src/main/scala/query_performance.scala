/**
 * @author German (panda@sumologic.com)
 */

import com.sumologic.client._
import model.SearchRequest
import scala.collection.JavaConversions._

val FindSessionQuery = "_sourcecategory=stream SessionQuery %s"

val sessionId = args(1)
val credentials = new ConfigurationCredentials(args(0))

val client = new SumoLogicClient(credentials)

val response = client.search(new SearchRequest(FindSessionQuery.format(sessionId)))

val message = response.getMessages.head
val executionTime = message.longField("executionTime")
val 
