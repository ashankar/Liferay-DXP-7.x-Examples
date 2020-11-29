<%--
/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
--%>

<%@page import="javax.portlet.RenderRequest"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/myportlet6/init.jsp" %>
<%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>

<clay:alert
	message="This is an error message."
	style="danger"
	title="Error"
/>



<%-- <%@ taglib prefix="clay" uri="http://liferay.com/tld/clay" %>
<@clay["button"] attribute="string value" attribute=10 />
 --%>
<!-- import ClayButton from '@clayui/button';
import ClayModel, {useModal} from '@clayui/modal'; -->



<%-- <%=renderRequest.getParameter("id1") %> --%>

<%-- <%=ParamUtil.getString(renderRequest, "id1") %> --%>
<!-- 

const Component = () => {
  const [visible, setVisible] = useState(false);
  const { observer, onClose } = useModal({
    onClose: () => setVisible(false)
  });

  return (
    <>
      {visible && (
        <ClayModal
          observer={observer}
          size="lg"
          spritemap={spritemap}
          status="info"
        >
          <ClayModal.Header>{"Title"}</ClayModal.Header>
          <ClayModal.Body>
            <h1>{"Hello world!"}</h1>
          </ClayModal.Body>
          <ClayModal.Footer
            first={
              <ClayButton.Group spaced>
                <ClayButton displayType="secondary">{"Secondary"}</ClayButton>
                <ClayButton displayType="secondary">{"Secondary"}</ClayButton>
              </ClayButton.Group>
            }
            last={<ClayButton onClick={onClose}>{"Primary"}</ClayButton>}
          />
        </ClayModal>
      )}
      <ClayButton displayType="primary" onClick={() => setVisible(true)}>
        {"Open modal"}
      </ClayButton>
    </>
  );
};

render(<Component />);



 -->










