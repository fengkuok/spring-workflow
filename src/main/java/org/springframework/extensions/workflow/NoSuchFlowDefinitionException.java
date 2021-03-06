package org.springframework.extensions.workflow;

/**
 * @author janm
 */
public class NoSuchFlowDefinitionException extends FlowRuntimeException {
    private static final long serialVersionUID = 3155710315447745334L;

    public NoSuchFlowDefinitionException(String msg) {
        super(msg);
    }
}
