ControlFocus("Open","","Edit1")
Sleep(5000)
ControlCommand("Open","","ComboBox2","SelectString","All Files")
Sleep(4000)
ControlSetText("Open","","Edit1","F:\Sel\"&$CmdLine[1])
ControlClick("Open","","Button1")