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
	mov ebx,3
	push ecx
	mov ecx, [c]
	SUB ecx,ebx

	push edx
	mov edx,2

	IMUL ecx,edx
	mov [c], ecx
	mov ebp,esp
	and esp,0xFFFFFFF0
	sub esp,16
	mov dword[esp],message
	mov eax,[c]
	mov dword[esp+4],eax
	call _printf
	 pop eax
	pop edx
	pop ebx
	ret