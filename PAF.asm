extern _printf
section .data
	message: db "%i",10,0

section .text
global start

start:
	push ebp
	mov ebp, esp
	sub esp,16
	mov ecx,3

	mov [ebp-4], ecx
	mov edx,19

	mov [ebp-8], edx
	mov ebx,[ebp-8]
	xor edx,edx
	mov eax,ebx
	mov ebx,[ebp-4]
	idiv ebx
	mov ebx,eax
	mov [ebp-12], ebx
	push dword [ebp-12]
	push dword message
	call _printf
	add esp,8
	nop
	add esp,16
	pop ebp
	mov eax,1
	mov ebx,0
	int 80h