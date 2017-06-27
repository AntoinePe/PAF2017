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
	mov edx,20

	mov [ebp-8], edx
	mov eax,-31

	mov ebx,[ebp-4]
	imul ebx,[ebp-8]
	add eax,ebx
	mov edx,20

	cmp [ebp-8], edx
	mov eax,eax
	cmovg eax,[ebp-4]
	mov [ebp-12], eax
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
