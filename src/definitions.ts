export interface ContextMenuPlugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
