extern _printf
extern _scanf
section .data
	intMessage: db "%i",0
	stringMessage: db "%s",0
	intMessageL: db "%i",10,0
	stringMessageL: db "%s",10,0
result0: db "%d",0
input: times 4 db 0
result1: db "%d",0
result2: db "%d",0
section .bss

section .text
global start

start:
	push ebp
	mov ebp, esp
	sub esp,32

	push .start.regle
	push dword stringMessage
	call _printf
	add esp,8
	mov ecx,999

	mov dword [ebp-8], ecx
	mov edx,999

	mov dword [ebp-12], edx
	mov ebx,999

	mov dword [ebp-16], ebx
	mov eax,0

	mov dword [ebp-20], eax
	mov ecx,1

	mov dword [ebp-24], ecx
	mov edx,0

	mov dword [ebp-28], edx
	mov ebx,0

	mov dword [ebp-32], ebx


.L0:
	mov ecx, [ebp-32]
	cmp [ebp-28], ecx
	mov edx,10

	cmp [ebp-24], edx
	mov eax,eax
	or eax, ebx
	cmp eax,1
	or .L1
	mov ecx,[ebp-24]
	xor edx,edx
	mov eax,ecx
	mov ebx,2
	idiv ebx
	mov ecx,edx
	mov edx,1

	cmp ecx, edx
	jne .L2
	push .start.j1
	push dword stringMessage
	call _printf
	add esp,8
	mov eax, [ebp-0]
	call printGrille
.L7:
	push dword input
	push dword result1
	call _scanf
	add esp,8
	mov edx,[input]
	mov [ebp-20], edx
	jmp .L8
.L8:
	mov eax, [ebp-8]
	mov ebx, [ebp-12]
	mov ecx, [ebp-16]
	mov edx, [ebp-0]
	call libre
	mov [esp+24],eax

	mov ebx,1

	cmp [esp+24], ebx
	je .L7
	mov eax, [ebp-0]
	mov ebx, [ebp-20]
	mov ecx, [ebp-24]
	call ecrire
	mov eax, [ebp-0]
	call fini
	mov [esp+20],eax

	mov ecx,1

	cmp [esp+20], ecx
	jne .L9
	mov ebx,1

	mov dword [ebp-28], ebx
.L9:
	jmp .L3
.L2:
	push .start.j2
	push dword stringMessage
	call _printf
	add esp,8
	mov eax, [ebp-0]
	call printGrille
.L10:
	push dword input
	push dword result2
	call _scanf
	add esp,8
	mov eax,[input]
	mov [ebp-20], eax
	jmp .L11
.L11:
	mov eax, [ebp-20]
	mov ebx, [ebp-0]
	call f
	mov [esp+16],eax

	mov ecx,1

	cmp [esp+16], ecx
	je .L10
	mov eax, [ebp-0]
	mov ebx, [ebp-20]
	mov ecx, [ebp-24]
	call ecrire
	mov eax, [ebp-8]
	mov ebx, [ebp-12]
	mov ecx, [ebp-16]
	call fini
	mov [esp+12],eax

	mov ebx,1

	cmp [esp+12], ebx
	jne .L12
	mov ecx,1

	mov dword [ebp-32], ecx
.L12:
.L3:
	mov edx,[ebp-24]
	add edx,1
	mov dword [ebp-24], edx
	jmp .L0
.L1:



	mov ebx,1

	cmp [ebp-28], ebx
	jne .L13
	push .start.w1
	push dword stringMessage
	call _printf
	add esp,8
	jmp .L14
.L13:
	mov ecx,1

	cmp [ebp-32], ecx
	jne .L15
	push .start.w2
	push dword stringMessage
	call _printf
	add esp,8
	jmp .L16
.L15:
	push .start.d
	push dword stringMessage
	call _printf
	add esp,8
.L16:
.L14:
	nop
	add esp,32
	pop ebp
	mov eax,1
	mov ebx,0
	int 80h
.start.d: db "Partie nulle",0
.start.j1: db "A joueur 1 de jouer",0
.start.regle: db "Les règles sont:",0
.start.j2: db "A joueur 2 de jouer",0
.start.w1: db "Joueur 1 a gagné",0
.start.w2: db "Joueur 2 a gagné",0
