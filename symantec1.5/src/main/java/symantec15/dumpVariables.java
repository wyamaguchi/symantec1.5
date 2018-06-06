package symantec15;

import org.mule.api.MuleMessage;
import org.mule.api.transformer.TransformerException;
import org.mule.transformer.AbstractMessageTransformer;

public class dumpVariables extends AbstractMessageTransformer {
  
  @Override
  public Object transformMessage(MuleMessage message, String outputEncoding) throws TransformerException {
	System.out.println("*******************Payload dump**************************");
	System.out.println(message.getPayload().toString());
	System.out.println("*******************flowVars dump**************************");
	System.out.println("*******************sessionVars dump**************************");
	return message;
  }

}