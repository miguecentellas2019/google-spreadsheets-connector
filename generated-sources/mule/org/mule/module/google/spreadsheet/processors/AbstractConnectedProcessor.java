
package org.mule.module.google.spreadsheet.processors;

import java.lang.reflect.Type;
import javax.annotation.Generated;
import org.mule.devkit.processor.DevkitBasedMessageProcessor;

@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-16T10:04:10-05:00", comments = "Build master.1915.dd1962d")
public abstract class AbstractConnectedProcessor
    extends DevkitBasedMessageProcessor
    implements ConnectivityProcessor
{


    public AbstractConnectedProcessor(String operationName) {
        super(operationName);
    }

    /**
     * {@inheritDoc}
     * 
     */
    @Override
    public Type typeFor(String fieldName)
        throws NoSuchFieldException
    {
        return AbstractConnectedProcessor.class.getDeclaredField(fieldName).getGenericType();
    }

}