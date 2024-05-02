#Simple Mikrotik Console Logger

The application is working only in the console!

To connect to the device whose logs you want to access:
Insert the host, username, and password in the Config file.
Start the application via the button in the Application class.

> #Commands:
><br/>**/log/print** - print the whole log.
><br/>**/log/print where XZ** - print the whole log with additional filtering.
><br/>X can be "message", "time", "number", "buffer", or "topics".
><br/>Z can be:
><br/>"=" (equals)
><br/>"<" (excluding)
><br/>">" (including)
><br/>"!=" (not equals)

> #Example
>**/log/print where message<"logged in"**
><br/>With that it is expected to log all the logs excluding those containing "logged in"
