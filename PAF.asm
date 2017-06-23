extern _printf
section .data
message: db "%i",10,0
c: db 0

section .text
global start



start:

	push eax
	mov eax,1
	mov [c], eax

	push ebx
	mov ebx,2

	push ecx
	mov ecx,[c]
	IMUL ecx,ebx
	mov [c], ecx
	mov ebp,esp
	and esp,0xFFFFFFF0
	sub esp,16
	mov dword[esp],message
	mov edx,[c]
	mov dword[esp+4],edx
	call _printf
	 pop edx
	pop eax
	pop ebx
	ret