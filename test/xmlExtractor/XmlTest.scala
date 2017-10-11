package xmlExtractor
import org.scalatest.FlatSpec
class XmlTest  extends FlatSpec {
  
  "A function" should "return a seq of Node from input Xml file " in {
    
    var xmlnode = new Xml()
     xmlnode.getNode("/music.xml").lenght should be (4) 
  }
  
  
}