Business Need: Login to the application
  In order to book a flight and see my accumulated points
  As a Frequent Flyer member
  I want to be able to access my account in a secure manner

  Rule: A valid Frequent Flyer providing valid credentials should be allowed to login

    Example: Tracy logs on with her valid credentials
      Given Bruce has a Frequent Flyer account
      When Bruce logs in using her credentials
      Then he should be taken to the booking page
