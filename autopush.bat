@echo off
:loop
git add .
git commit -m "Updated: %date% %time%"
git push origin main
timeout /t 60 >nul
goto loop
