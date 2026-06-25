CREATE OR REPLACE PROCEDURE GetMessage
AS
BEGIN
    DBMS_OUTPUT.PUT_LINE('Hello from Stored Procedure');
END;
/

BEGIN
    GetMessage;
END;
/