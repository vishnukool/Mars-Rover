@ECHO OFF
IF NOT "%~f0" == "~f0" GOTO :WinNT
@"jruby.exe" "d:/Mars Rover/tools/cuke4duke/.jruby/bin/prettify_json.rb" %1 %2 %3 %4 %5 %6 %7 %8 %9
GOTO :EOF
:WinNT
@"jruby.exe" "%~dpn0" %*
