all:
	nasm -f macho -o PAF.o PAF.asm && ld -o PAF PAF.o -arch i386 -lc -macosx_version_min 10.6