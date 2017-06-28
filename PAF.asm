extern _printf
section .data
	intMessage: db "%i",10,0
	stringMessage: db "%s",10,0
section .bss

section .text
global start

start:
	push ebp
	mov ebp, esp
	sub esp,16
	mov ecx,3

	add ecx,4
	mov dword [ebp-4], ecx
	mov ebx,2

	mov dword [ebp-8], ebx
	mov eax,3

	mov ecx,[ebp-8]
	sal eax,cl
	mov dword [ebp-12], eax
	push dword [ebp-12]
	push dword intMessage
	call _printf
	add esp,8
	mov edx,[ebp-12]
	sal edx,4
	mov dword [ebp-12], edx
	push dword [ebp-12]
	push dword intMessage
	call _printf
	add esp,8
	mov ebx,13

	mov dword [ebp-16], ebx
	mov eax,13

	sar eax,3
	mov dword [ebp-16], eax
	push dword [ebp-16]
	push dword intMessage
	call _printf
	add esp,8
	mov edx,[ebp-12]
	or edx,[ebp-16]

	mov ebx,193

	cmp edx, ebx
	jne .L0
	mov eax,1
	jmp .L1
.L0:
	mov eax,0
.L1:
	mov dword [ebp-20], eax
	mov ecx,[ebp-20]
	sal ecx,8

	push ecx
	push dword intMessage
	call _printf
	add esp,8
	nop
	add esp,16
	pop ebp
	mov eax,1
	mov ebx,0
	int 80h
