package org.springframework.extensions.workflow.instance;

import java.util.Iterator;

public class DefaultFlowInstanceDescriptorPersister implements FlowInstanceDescriptorPersister {

    public void persist(FlowInstanceDescriptor descriptor) {
        // noop
    }

    public Iterator<? extends FlowInstanceDescriptor> getDescriptorsWithTimeoutsAndDateInPast() {
        return null;
    }
}
