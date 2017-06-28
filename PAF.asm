extern _printf
extern _scanf
section .data
	intMessage: db "%i",10,0
	stringMessage: db "%s",10,0
result0: db "%d",0
input: times 4 db 0
section .bss

section .text
global start

start:
	push ebp
	mov ebp, esp
	sub esp,16
	mov eax, 37
	mov ebx, 34
	mov ecx, 48
	call Takeuchi
	mov [esp+32],eax

	mov ecx,[esp+32]
	mov dword [ebp-4],ecx

	push dword [ebp-4]
	push dword intMessage
	call _printf
	add esp,8
	mov eax, 37
	mov ebx, 34
	mov ecx, 48
	call Tak
	mov [esp+28],eax

	mov edx,[esp+28]
	mov dword [ebp-8],edx

	push dword [ebp-8]
	push dword intMessage
	call _printf
	add esp,8
	mov dword [ebp-12], 0
	push dword input
	push dword result0
	call _scanf
	add esp,8
	mov ebx,[input]
	mov [ebp-12], ebx
	mov eax, [ebp-12]
	call McCarthy
	mov [esp+24],eax

	mov eax,[esp+24]
	mov dword [ebp-16],eax

	push dword [ebp-16]
	push dword intMessage
	call _printf
	add esp,8
	nop
	add esp,16
	pop ebp
	mov eax,1
	mov ebx,0
	int 80h

McCarthy:
	push ebp
	mov ebp, esp
	sub esp,16
	mov [ebp-4], eax
	mov dword [ebp-8], 0
	mov ecx,100

	cmp [ebp-4], ecx
	jle .L0
	mov eax,[ebp-4]
	sub eax,10
	mov dword [ebp-8], eax
	jmp .L1
.L0:
	mov ecx,[ebp-4]
	add ecx,11
	mov eax, ecx
	call McCarthy
	mov [esp+32],eax

	mov eax, [esp+32]
	call McCarthy
	mov [esp+28],eax

	mov edx,[esp+28]
	mov dword [ebp-8],edx

.L1:
	mov eax,[ebp-8]
	add esp,16
	pop ebp
	ret

Takeuchi:
	push ebp
	mov ebp, esp
	sub esp,32
	mov [ebp-4], eax
	mov [ebp-8], ebx
	mov [ebp-12], ecx
	mov dword [ebp-16], 0
	mov eax, [ebp-4]
	cmp [ebp-8], eax
	jge .L2
	mov ecx,[ebp-4]
	sub ecx,1
	mov eax, ecx
	mov ebx, [ebp-8]
	mov ecx, [ebp-12]
	call Takeuchi
	mov [esp+16],eax

	mov edx,[ebp-8]
	sub edx,1
	mov eax, edx
	mov ebx, [ebp-12]
	mov ecx, [ebp-4]
	call Takeuchi
	mov [esp+12],eax

	mov ebx,[ebp-12]
	sub ebx,1
	mov eax, ebx
	mov ebx, [ebp-4]
	mov ecx, [ebp-8]
	call Takeuchi
	mov [esp+8],eax

	mov eax, [esp+16]
	mov ebx, [esp+12]
	mov ecx, [esp+8]
	call Takeuchi
	mov [esp+4],eax

	mov eax,[esp+4]
	mov dword [ebp-16],eax

	jmp .L3
.L2:
	mov ecx,[ebp-8]
	mov dword [ebp-16],ecx

.L3:
	mov eax,[ebp-16]
	add esp,32
	pop ebp
	ret

Tak:
	push ebp
	mov ebp, esp
	sub esp,16
	mov [ebp-4], eax
	mov [ebp-8], ebx
	mov [ebp-12], ecx
	mov dword [ebp-16], 0
	mov ebx, [ebp-8]
	cmp [ebp-4], ebx
	jg .L4
	mov ecx,[ebp-8]
	mov dword [ebp-16],ecx

	jmp .L5
.L4:
	mov ebx, [ebp-12]
	cmp [ebp-8], ebx
	jg .L6
	mov ecx,[ebp-12]
	mov dword [ebp-16],ecx

	jmp .L7
.L6:
	mov edx,[ebp-4]
	mov dword [ebp-16],edx

.L7:
.L5:
	mov eax,[ebp-16]
	add esp,16
	pop ebp
	ret
