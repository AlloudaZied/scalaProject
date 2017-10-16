package xmlExtractor

import scala.xml.NodeSeq
import scala.xml.Elem
/**
 * Implement Trait to extract pertinent data 
 * @author SENDI
 */
class AttributeTraitImpl extends AttributeTrait[NodeSeq] {
  
  /**
   * Function That get The list of artist from Node XMl
   */
  override def getArtist(file :Elem):List[String] = {
    val nodeseq = file \\ "artist"
    var returnedList = List("","","")
    val strBuild = nodeseq.toString()
    returnedList.addString(new StringBuilder(strBuild))
    println(returnedList)
    returnedList
    
   
    
       
  }
  /**
   * Function That get The list of Album for a giving Artist
   */
  override def getAlbum():List[String] = {
    val returnedList = List("","")
    returnedList
    
  }
  /**
   * Function That get The list of songs for a giving Album
   */
  override def getSongs() :List[String] ={
     val returnedList = List("","")
    returnedList
    
  }

  
  
}